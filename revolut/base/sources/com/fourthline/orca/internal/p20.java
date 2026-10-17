package com.fourthline.orca.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class p20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f31804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f31805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f31806c;
    private final Map d;

    public p20(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f31804a = tracker;
        this.f31805b = new LinkedHashMap();
        this.f31806c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public final void a(u20 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f31805b.containsKey(state.a())) {
            return;
        }
        this.f31805b.put(state.a(), state);
        this.f31806c.put(state.a(), state);
        if (state.getText().length() > 0) {
            this.f31804a.a(new n20(state.a()));
        }
    }

    public final void b(u20 updatedState) {
        Intrinsics.checkNotNullParameter(updatedState, "updatedState");
        if (updatedState.getState() != l20.f30508b) {
            u20 u20Var = (u20) this.f31806c.get(updatedState.a());
            if (u20Var != null && !Intrinsics.f(updatedState.getText(), u20Var.getText())) {
                this.d.remove(updatedState.a());
                this.f31804a.a(new m20(updatedState.a()));
            }
            this.f31806c.put(updatedState.a(), updatedState);
        }
    }

    public final void a(u20 validatedState, y20 error) {
        Intrinsics.checkNotNullParameter(validatedState, "validatedState");
        Intrinsics.checkNotNullParameter(error, "error");
        if (validatedState.getState() == l20.f30509c) {
            if (this.d.get(validatedState.a()) == null) {
                this.f31804a.a(new o20(validatedState.a(), error));
            }
            this.f31806c.put(validatedState.a(), validatedState);
            this.d.put(validatedState.a(), error);
        }
    }
}
