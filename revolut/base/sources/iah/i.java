package iah;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import nii.t1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f160032b;

    public /* synthetic */ i(m0 m0Var, int i) {
        this.f160031a = i;
        this.f160032b = m0Var;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f160031a) {
            case 0:
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f160032b;
    }
}
