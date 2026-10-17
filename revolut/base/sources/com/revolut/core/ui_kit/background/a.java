package com.revolut.core.ui_kit.background;

import android.content.Context;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;
import po0.t;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements t, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f51504a;

    public a(Context context) {
        this.f51504a = context;
    }

    @Override // po0.t
    public final int a(int i) {
        return kli.a.s(i, this.f51504a);
    }

    public final boolean equals(Object obj2) {
        if ((obj2 instanceof t) && (obj2 instanceof n)) {
            return Intrinsics.f(getFunctionDelegate(), ((n) obj2).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        return new q(1, 1, kli.a.class, this.f51504a, "obtainColorFromAttr", "obtainColorFromAttr(Landroid/content/Context;I)I");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
