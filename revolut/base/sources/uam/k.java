package uam;

import android.hardware.Camera;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f78.a f278700h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(f78.a aVar, int i) {
        super(0);
        this.f = i;
        this.f278700h = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listK;
        Integer numValueOf;
        switch (this.f) {
            case 0:
                f78.a aVar = this.f278700h;
                return new IntRange(((Camera.Parameters) aVar.f132562a).getMinExposureCompensation(), ((Camera.Parameters) aVar.f132562a).getMaxExposureCompensation(), 1);
            case 1:
                List<String> supportedFlashModes = ((Camera.Parameters) this.f278700h.f132562a).getSupportedFlashModes();
                return supportedFlashModes == null ? zhm.u.c("off") : supportedFlashModes;
            case 2:
                return ((Camera.Parameters) this.f278700h.f132562a).getSupportedFocusModes();
            case 3:
                return Integer.valueOf(((Camera.Parameters) this.f278700h.f132562a).getMaxNumFocusAreas());
            case 4:
                return Integer.valueOf(((Camera.Parameters) this.f278700h.f132562a).getMaxNumMeteringAreas());
            case 5:
                return ((Camera.Parameters) this.f278700h.f132562a).getSupportedPictureSizes();
            case 6:
                return ((Camera.Parameters) this.f278700h.f132562a).getSupportedPreviewSizes();
            case 7:
                Camera.Parameters parameters = (Camera.Parameters) this.f278700h.f132562a;
                List keys = m.f278701a;
                Intrinsics.checkNotNullParameter(parameters, "<this>");
                Intrinsics.checkNotNullParameter(keys, "keys");
                Iterator it8 = keys.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        String str = parameters.get((String) it8.next());
                        listK = str != null ? new Regex(",").k(str) : null;
                        if (listK != null) {
                        }
                    } else {
                        listK = f0.f322471a;
                    }
                }
                Intrinsics.checkNotNullParameter(listK, "<this>");
                ArrayList arrayList = new ArrayList();
                Iterator it9 = listK.iterator();
                while (it9.hasNext()) {
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt(d0.F0((String) it9.next()).toString()));
                    } catch (NumberFormatException unused) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList.add(numValueOf);
                    }
                    break;
                }
                return arrayList;
            case 8:
                List<String> supportedAntibanding = ((Camera.Parameters) this.f278700h.f132562a).getSupportedAntibanding();
                return supportedAntibanding == null ? zhm.u.c("off") : supportedAntibanding;
            case 9:
                return ((Camera.Parameters) this.f278700h.f132562a).getSupportedPreviewFpsRange();
            case 10:
                return Boolean.valueOf(((Camera.Parameters) this.f278700h.f132562a).isSmoothZoomSupported());
            default:
                Camera.Parameters parameters2 = (Camera.Parameters) this.f278700h.f132562a;
                if (!parameters2.isZoomSupported()) {
                    return n.f278702a;
                }
                int maxZoom = parameters2.getMaxZoom();
                List<Integer> zoomRatios = parameters2.getZoomRatios();
                Intrinsics.checkNotNullExpressionValue(zoomRatios, "cameraParameters.zoomRatios");
                return new o(maxZoom, zoomRatios);
        }
    }
}
