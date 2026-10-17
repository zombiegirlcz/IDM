package yrk;

import ael.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.s;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f316325b;

    public /* synthetic */ d(g gVar, int i) {
        this.f316324a = i;
        this.f316325b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f316324a) {
            case 0:
                uqk.e it8 = (uqk.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f316325b.a().c(s.f270018a);
            default:
                String ref2 = (String) obj2;
                Intrinsics.checkNotNullParameter(ref2, "ref");
                return ((k) this.f316325b.f316333c).e(ref2);
        }
    }
}
