package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Rect;
import androidx.content.NavBackStackEntry;
import androidx.content.NavHostController;
import com.fourthline.orca.internal.lo;
import com.fourthline.vision.RecordingType;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ek1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28171c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ek1(Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f28169a = i2;
        this.e = obj2;
        this.f28170b = obj3;
        this.f28171c = obj4;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f28169a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return c91.a((v81) this.e, (Flow) this.f28170b, (Function1) this.f28171c, this.d, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return d70.a((b70) this.e, (Flow) this.f28170b, (Function1) this.f28171c, this.d, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return dp0.a((gb1) this.e, (Function1) this.f28171c, (Flow) this.f28170b, this.d, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return hi0.a((zp0) this.e, (Function1) this.f28171c, (Function1) this.f28170b, this.d, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return hm.a((fm) this.e, (Flow) this.f28170b, (Function1) this.f28171c, this.d, (Composer) obj2, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj3).intValue();
                return hv.a((ff0) this.e, (Flow) this.f28170b, (Function1) this.f28171c, this.d, (Composer) obj2, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj3).intValue();
                return i0.a((f0) this.e, (Flow) this.f28170b, (Function1) this.f28171c, this.d, (Composer) obj2, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj3).intValue();
                return ku.a((bu) this.e, (Flow) this.f28170b, (Function1) this.f28171c, this.d, (Composer) obj2, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj3).intValue();
                return mb1.a((gb1) this.e, (Function1) this.f28171c, (String) this.f28170b, this.d, (Composer) obj2, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj3).intValue();
                return oe1.a((String) this.e, (String) this.f28170b, (List) this.f28171c, this.d, (Composer) obj2, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj3).intValue();
                return s3.a((p3) this.e, (Flow) this.f28170b, (Function1) this.f28171c, this.d, (Composer) obj2, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj3).intValue();
                return so.a((lo.c) this.e, (Function1) this.f28171c, (Function1) this.f28170b, this.d, (Composer) obj2, iIntValue12);
            case 12:
                int iIntValue13 = ((Integer) obj3).intValue();
                return so.a((z10) this.e, (z10) this.f28170b, (Function0) this.f28171c, this.d, (Composer) obj2, iIntValue13);
            case 13:
                int iIntValue14 = ((Integer) obj3).intValue();
                return ue0.a((qe0) this.e, (Flow) this.f28170b, (Function1) this.f28171c, this.d, (Composer) obj2, iIntValue14);
            case 14:
                int iIntValue15 = ((Integer) obj3).intValue();
                return v00.a((d8) this.e, (NavBackStackEntry) this.f28170b, (n01) this.f28171c, this.d, (Composer) obj2, iIntValue15);
            case 15:
                int iIntValue16 = ((Integer) obj3).intValue();
                return v1.a((NavHostController) this.e, (String) this.f28170b, (Function1) this.f28171c, this.d, (Composer) obj2, iIntValue16);
            case 16:
                int iIntValue17 = ((Integer) obj3).intValue();
                return vl0.a((sl0) this.e, (Flow) this.f28170b, (Function1) this.f28171c, this.d, (Composer) obj2, iIntValue17);
            case 17:
                int iIntValue18 = ((Integer) obj3).intValue();
                return wc0.a((s20) this.e, (Function1) this.f28171c, (Function1) this.f28170b, this.d, (Composer) obj2, iIntValue18);
            case 18:
                int iIntValue19 = ((Integer) obj3).intValue();
                return xb.a((wb) this.e, (Flow) this.f28170b, (Function1) this.f28171c, this.d, (Composer) obj2, iIntValue19);
            case 19:
                int iIntValue20 = ((Integer) obj3).intValue();
                return zw0.a((rw0) this.e, (Flow) this.f28170b, (Function1) this.f28171c, this.d, (Composer) obj2, iIntValue20);
            case 20:
                int iIntValue21 = ((Integer) obj3).intValue();
                return com.fourthline.vision.internal.wf.CameraPreview$lambda$3((com.fourthline.vision.internal.xf) this.e, (com.fourthline.vision.internal.i8) this.f28170b, (Rect) this.f28171c, this.d, (Composer) obj2, iIntValue21);
            default:
                int iIntValue22 = ((Integer) obj3).intValue();
                return com.fourthline.vision.internal.z1.PermissionGate$lambda$1((RecordingType) this.e, (Function1) this.f28171c, (Function2) this.f28170b, this.d, (Composer) obj2, iIntValue22);
        }
    }

    public /* synthetic */ ek1(Object obj2, Function1 function1, Object obj3, int i, int i2) {
        this.f28169a = i2;
        this.e = obj2;
        this.f28171c = function1;
        this.f28170b = obj3;
        this.d = i;
    }
}
