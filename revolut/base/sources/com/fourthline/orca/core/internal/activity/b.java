package com.fourthline.orca.core.internal.activity;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.Lifecycle;
import com.fourthline.orca.internal.bj0;
import com.fourthline.vision.internal.w9;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ub.m;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26654c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj2, Object obj3, int i, int i2) {
        this.f26652a = i2;
        this.f26654c = obj2;
        this.d = obj3;
        this.f26653b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f26652a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return OrcaActivity.a((OrcaActivity) this.f26654c, (bj0) this.d, this.f26653b, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return w9.PlayServicesGate$lambda$2((Function0) this.f26654c, (Function2) this.d, this.f26653b, (Composer) obj2, iIntValue2);
            default:
                ((Integer) obj3).getClass();
                m.a((List) this.f26654c, (Lifecycle.Event) this.d, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(this.f26653b | 1));
                return Unit.f186387a;
        }
    }
}
