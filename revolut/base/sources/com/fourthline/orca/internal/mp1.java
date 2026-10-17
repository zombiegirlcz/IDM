package com.fourthline.orca.internal;

import android.hardware.SensorEvent;
import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.unit.Density;
import androidx.content.NavGraphBuilder;
import androidx.content.NavOptionsBuilder;
import androidx.content.PopUpToBuilder;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.m21;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class mp1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31243b;

    public /* synthetic */ mp1(Object obj2, int i) {
        this.f31242a = i;
        this.f31243b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f31242a) {
            case 0:
                return m21.j.a((l21) this.f31243b, (c21) obj2);
            case 1:
                return b60.a((b60) this.f31243b, (NavGraphBuilder) obj2);
            case 2:
                return bk0.a((bk0) this.f31243b, (NavGraphBuilder) obj2);
            case 3:
                return d01.a((d01) this.f31243b, (NavGraphBuilder) obj2);
            case 4:
                return e91.a((e91) this.f31243b, (v81) obj2);
            case 5:
                return ep.a((ep) this.f31243b, (NavGraphBuilder) obj2);
            case 6:
                return ft0.a((ft0) this.f31243b, (NavGraphBuilder) obj2);
            case 7:
                return g0.a((g0) this.f31243b, (f0) obj2);
            case 8:
                return go0.a((go0) this.f31243b, (bo0) obj2);
            case 9:
                return h91.a((h91) this.f31243b, (NavGraphBuilder) obj2);
            case 10:
                return hf1.a((ff1) this.f31243b, (kh0) obj2);
            case 11:
                return hh.a((hh) this.f31243b, (NavGraphBuilder) obj2);
            case 12:
                return hi0.a((Animatable) this.f31243b, (Density) obj2);
            case 13:
                return im.a((im) this.f31243b, (fm) obj2);
            case 14:
                return jw.a((jw) this.f31243b, (SensorEvent) obj2);
            case 15:
                return k0.a((k0) this.f31243b, (NavGraphBuilder) obj2);
            case 16:
                return k01.a((k01) this.f31243b, (NavGraphBuilder) obj2);
            case 17:
                return kd0.a((kd0) this.f31243b, (NavGraphBuilder) obj2);
            case 18:
                return lt0.a((jt0) this.f31243b, (kh0) obj2);
            case 19:
                return Boolean.valueOf(m70.a((k70) this.f31243b, (String) obj2));
            case 20:
                return po.a((po) this.f31243b, (NavGraphBuilder) obj2);
            case 21:
                return qi.a((qi) this.f31243b, (li) obj2);
            case 22:
                return qz.a(60L, (jg0) this.f31243b, (zdm.a) obj2);
            case 23:
                return r40.a((sp0) this.f31243b, (PopUpToBuilder) obj2);
            case 24:
                return r40.a((p80) this.f31243b, (NavOptionsBuilder) obj2);
            case 25:
                return rs.a((rs) this.f31243b, (NavGraphBuilder) obj2);
            case 26:
                return s01.a((q01) this.f31243b, (hq0.c) obj2);
            case 27:
                return t3.a((t3) this.f31243b, (p3) obj2);
            case 28:
                return th.a((th) this.f31243b, (s2) obj2);
            default:
                return u3.a((u3) this.f31243b, (p3) obj2);
        }
    }
}
