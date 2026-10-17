package com.fourthline.vision.internal;

import com.fourthline.vision.internal.bb;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class fg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m7 f36212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i6 f36213c;
    public final /* synthetic */ zd d;
    public final /* synthetic */ k6 e;
    public final /* synthetic */ n9 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q7 f36214g;

    public /* synthetic */ fg(m7 m7Var, i6 i6Var, zd zdVar, k6 k6Var, n9 n9Var, q7 q7Var, int i) {
        this.f36211a = i;
        this.f36212b = m7Var;
        this.f36213c = i6Var;
        this.d = zdVar;
        this.e = k6Var;
        this.f = n9Var;
        this.f36214g = q7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f36211a) {
            case 0:
                return bb.provideTurnHeadLeftStep$lambda$0(this.f36212b, this.f36213c, this.d, this.e, this.f, (ce) this.f36214g, (bb.c) obj2);
            case 1:
                return bb.provideRandomnessLivenessStep$lambda$0(this.f36212b, this.f36213c, this.d, this.e, this.f, (d8) this.f36214g, (bb.c) obj2);
            default:
                return bb.provideTurnHeadRightStep$lambda$0(this.f36212b, this.f36213c, this.d, this.e, this.f, (de) this.f36214g, (bb.c) obj2);
        }
    }
}
