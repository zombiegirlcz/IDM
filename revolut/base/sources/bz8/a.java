package bz8;

import com.google.gson.reflect.TypeToken;
import he0.k;
import java.util.Objects;
import kg.j0;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import oy8.b;
import xu.g;
import xu.h;
import xu.j;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f19935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f19936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f19937c;
    public final o d;

    public a(g cameraExposureProvider, h cameraFpsProvider, j cameraVideoStartDelayProvider) {
        Intrinsics.checkNotNullParameter(cameraExposureProvider, "cameraExposureProvider");
        Intrinsics.checkNotNullParameter(cameraFpsProvider, "cameraFpsProvider");
        Intrinsics.checkNotNullParameter(cameraVideoStartDelayProvider, "cameraVideoStartDelayProvider");
        this.f19935a = cameraExposureProvider;
        this.f19936b = cameraFpsProvider;
        this.f19937c = cameraVideoStartDelayProvider;
        p pVar = new p();
        j0 j0Var = j0.LONG_OR_DOUBLE;
        Objects.requireNonNull(j0Var);
        pVar.f183887m = j0Var;
        pVar.c(new k(), new TypeToken<String>() { // from class: com.revolut.feature.kyc_documents_scan.video_selfie.VideoSelfieMetadataBuilderImpl$gson$1
        }.getType());
        this.d = pVar.b();
    }
}
