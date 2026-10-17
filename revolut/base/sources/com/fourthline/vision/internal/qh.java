package com.fourthline.vision.internal;

import android.content.Context;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.location.LocationProviderError;
import com.fourthline.orca.core.flavor.OrcaColors;
import com.fourthline.orca.core.flavor.OrcaFlavorExtensionsKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class qh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36741a;

    public /* synthetic */ qh(int i) {
        this.f36741a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f36741a) {
            case 0:
                return wf.KeepScreenOn$lambda$0$0((Context) obj2);
            case 1:
                return y.start$lambda$0((Throwable) obj2);
            case 2:
                return y.start$lambda$1((l0) obj2);
            case 3:
                return y1.startableConsumer$lambda$2(obj2);
            case 4:
                return y1.consumer$lambda$0(obj2);
            case 5:
                return yf.VisionXComposable$lambda$5$1$1$0((SemanticsPropertyReceiver) obj2);
            case 6:
                return yf.VisionXComposable$lambda$0$0((l0) obj2);
            case 7:
                return LocationProvider.a((Coordinate) obj2);
            case 8:
                return LocationProvider.a((LocationProviderError) obj2);
            case 9:
                Pair it8 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                String str = (String) it8.f186385a;
                Object obj3 = it8.f186386b;
                if (obj3 == null) {
                    return str;
                }
                return str + '=' + String.valueOf(obj3);
            case 10:
                return com.fourthline.kyc.internal.e.a((Map.Entry) obj2);
            case 11:
                return com.fourthline.kyc.internal.g.j((com.fourthline.kyc.internal.e) obj2);
            case 12:
                return com.fourthline.kyc.internal.g.d((com.fourthline.kyc.internal.e) obj2);
            case 13:
                return com.fourthline.kyc.internal.g.k((com.fourthline.kyc.internal.e) obj2);
            case 14:
                return com.fourthline.kyc.internal.g.l((com.fourthline.kyc.internal.e) obj2);
            case 15:
                return com.fourthline.kyc.internal.g.o((com.fourthline.kyc.internal.e) obj2);
            case 16:
                return com.fourthline.kyc.internal.g.a((com.fourthline.kyc.internal.e) obj2);
            case 17:
                return com.fourthline.kyc.internal.g.h((com.fourthline.kyc.internal.e) obj2);
            case 18:
                return com.fourthline.kyc.internal.g.i((com.fourthline.kyc.internal.e) obj2);
            case 19:
                return com.fourthline.kyc.internal.g.g((com.fourthline.kyc.internal.e) obj2);
            case 20:
                return com.fourthline.kyc.internal.g.m((com.fourthline.kyc.internal.e) obj2);
            case 21:
                return com.fourthline.kyc.internal.g.n((com.fourthline.kyc.internal.e) obj2);
            case 22:
                return com.fourthline.kyc.internal.g.b((com.fourthline.kyc.internal.e) obj2);
            case 23:
                return com.fourthline.kyc.internal.g.c((com.fourthline.kyc.internal.e) obj2);
            case 24:
                return com.fourthline.kyc.internal.g.e((com.fourthline.kyc.internal.e) obj2);
            case 25:
                return com.fourthline.kyc.internal.g.f((com.fourthline.kyc.internal.e) obj2);
            case 26:
                CharSequence it9 = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Integer.valueOf(it9.length());
            case 27:
                kem.y it10 = (kem.y) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Integer.valueOf(it10.f183243a.length());
            case 28:
                return OrcaFlavorExtensionsKt.E0((OrcaColors) obj2);
            default:
                return OrcaFlavorExtensionsKt.n((OrcaColors) obj2);
        }
    }
}
