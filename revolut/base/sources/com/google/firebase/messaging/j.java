package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Continuation, efm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f49503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49505c;

    public /* synthetic */ j(Object obj2, Object obj3, boolean z) {
        this.f49504b = obj2;
        this.f49505c = obj3;
        this.f49503a = z;
    }

    @Override // efm.g
    public efm.f d(efm.b upstream) {
        f9b.f fVar = (f9b.f) this.f49504b;
        Function1 function1 = (Function1) this.f49505c;
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return upstream.m(new f2i.o(new a09.z(fVar, function1, this.f49503a, 25), 21)).l(new a08.d(fVar, 17));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? k.a((Context) this.f49504b, (Intent) this.f49505c, this.f49503a).continueWith(new h(0), new cie.b(7)) : task;
    }
}
