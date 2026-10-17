package com.fourthline.orca.internal;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;

/* JADX INFO: loaded from: classes23.dex */
public final class jg0 implements db0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f29892a = new ConcurrentHashMap();

    public final ulm.l0 b() {
        return new bj1(this, 2);
    }

    @Override // com.fourthline.orca.internal.db0
    public String a() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.fourthline.orca.internal.db0
    public bb0 a(String str) {
        if (str != null) {
            if (kotlin.text.d0.W(str)) {
                str = null;
            }
            if (str != null) {
                return (bb0) this.f29892a.remove(str);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ulm.m0 a(jg0 jg0Var, Call it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return new ig0(jg0Var.f29892a);
    }
}
