package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DeviceMetadata;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wx0 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function2 {
        public a(Object obj2) {
            super(2, 0, ls0.class, obj2, "downloadDocumentToSign", "downloadDocumentToSign(Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gw invoke(String p0, String p17) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p17, "p1");
            return ((ls0) this.receiver).a(p0, p17);
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public b(Object obj2) {
            super(1, 0, ls0.class, obj2, "resendOtp", "resendOtp(Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gw invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((ls0) this.receiver).c(p0);
        }
    }

    public static final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
        public c(Object obj2) {
            super(1, 0, ls0.class, obj2, "getDetails", "getDetails(Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gw invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((ls0) this.receiver).a(p0);
        }
    }

    public static final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
        public d(Object obj2) {
            super(1, 0, ls0.class, obj2, "startSignature", "startSignature(Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gw invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((ls0) this.receiver).d(p0);
        }
    }

    public static final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function1 {
        public e(Object obj2) {
            super(1, 0, ls0.class, obj2, "uploadSelfie", "uploadSelfie(Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gw invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((ls0) this.receiver).f(p0);
        }
    }

    public static final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function1 {
        public f(Object obj2) {
            super(1, 0, ls0.class, obj2, "authorize", "authorize(Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gw invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((ls0) this.receiver).b(p0);
        }
    }

    public static final /* synthetic */ class g extends kotlin.jvm.internal.q implements Function1 {
        public g(Object obj2) {
            super(1, 0, ls0.class, obj2, "confirm", "confirm(Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gw invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((ls0) this.receiver).e(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceMetadata a(DeviceMetadata deviceMetadata) {
        return deviceMetadata;
    }

    public final ls0 a() {
        return new ve1();
    }

    public final qx0 b(ls0 qesEndpoints, ib0 networkService, yv0 confirmStatusWorker, sg0 tracker) {
        Intrinsics.checkNotNullParameter(qesEndpoints, "qesEndpoints");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(confirmStatusWorker, "confirmStatusWorker");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new px0(new ya0(new g(qesEndpoints), networkService), confirmStatusWorker, new k81(tracker));
    }

    public final fv0 a(kh1 workflowStatusWorker) {
        Intrinsics.checkNotNullParameter(workflowStatusWorker, "workflowStatusWorker");
        return new wg1(workflowStatusWorker);
    }

    public final yv0 a(fv0 getSignatureStatusWorker) {
        Intrinsics.checkNotNullParameter(getSignatureStatusWorker, "getSignatureStatusWorker");
        return new pa0(getSignatureStatusWorker, 0L, null, 6, null);
    }

    public final ex0 a(ls0 qesEndpoints, DeviceMetadata deviceMetadata, ib0 networkService) {
        Intrinsics.checkNotNullParameter(qesEndpoints, "qesEndpoints");
        Intrinsics.checkNotNullParameter(deviceMetadata, "deviceMetadata");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        return new ta0(new d(qesEndpoints), networkService, new xr1(deviceMetadata, 28));
    }

    public final cw0 b(ls0 qesEndpoints, ib0 networkService) {
        Intrinsics.checkNotNullParameter(qesEndpoints, "qesEndpoints");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        return new ra0(new c(qesEndpoints), networkService);
    }

    public final fx0 a(ex0 startSignatureRequestWorker, yv0 pollStatusWorker, sg0 tracker) {
        Intrinsics.checkNotNullParameter(startSignatureRequestWorker, "startSignatureRequestWorker");
        Intrinsics.checkNotNullParameter(pollStatusWorker, "pollStatusWorker");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new hx(startSignatureRequestWorker, pollStatusWorker, new k81(tracker));
    }

    public final px b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new q40(a(context));
    }

    public final bw0 a(ls0 qesEndpoints, ib0 networkService) {
        Intrinsics.checkNotNullParameter(qesEndpoints, "qesEndpoints");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        return new qa0(new b(qesEndpoints), networkService);
    }

    public final is0 a(ib0 networkService, px fileWriter) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(fileWriter, "fileWriter");
        return new na0(networkService, fileWriter);
    }

    public final js0 a(ls0 qesEndpoints, ib0 networkService, px fileWriter) {
        Intrinsics.checkNotNullParameter(qesEndpoints, "qesEndpoints");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(fileWriter, "fileWriter");
        return new oa0(new a(qesEndpoints), networkService, fileWriter);
    }

    public final dw0 a(cw0 qesRetrieveSigningDetailsRequestWorker, is0 qesDownloadLegalDocumentWorker, js0 qesDownloadSignDocumentWorker, sg0 tracker) {
        Intrinsics.checkNotNullParameter(qesRetrieveSigningDetailsRequestWorker, "qesRetrieveSigningDetailsRequestWorker");
        Intrinsics.checkNotNullParameter(qesDownloadLegalDocumentWorker, "qesDownloadLegalDocumentWorker");
        Intrinsics.checkNotNullParameter(qesDownloadSignDocumentWorker, "qesDownloadSignDocumentWorker");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new gx(qesRetrieveSigningDetailsRequestWorker, qesDownloadLegalDocumentWorker, qesDownloadSignDocumentWorker, new k81(tracker));
    }

    public final nx0 a(ls0 qesEndpoints, ib0 networkService, yv0 pollStatusWorker, sg0 tracker) {
        Intrinsics.checkNotNullParameter(qesEndpoints, "qesEndpoints");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(pollStatusWorker, "pollStatusWorker");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new lx0(new wa0(new f(qesEndpoints), networkService), pollStatusWorker, new k81(tracker));
    }

    public final kx0 a(ls0 qesEndpoints, ib0 networkService, yv0 pollStatusWorker) {
        Intrinsics.checkNotNullParameter(qesEndpoints, "qesEndpoints");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(pollStatusWorker, "pollStatusWorker");
        return new rx0(new va0(new e(qesEndpoints), networkService), pollStatusWorker);
    }

    public final File a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File file = new File(context.getFilesDir(), "fourthline_qes");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
