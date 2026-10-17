package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.orca.internal.gp0;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class pm0 {

    public static final class a implements bp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f31997a;

        public a(an0 an0Var) {
            this.f31997a = an0Var.getSupportedDocuments();
        }

        @Override // com.fourthline.orca.internal.bp0
        public List a() {
            return this.f31997a;
        }
    }

    public static final class b implements cp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mp0 f31998a;

        public b(mp0 mp0Var) {
            this.f31998a = mp0Var;
        }

        @Override // com.fourthline.orca.internal.cp0
        public void a(URI uri2) {
            Intrinsics.checkNotNullParameter(uri2, "uri");
            this.f31998a.a(new gp0.a(uri2));
        }

        @Override // com.fourthline.orca.internal.cp0
        public void a(Bitmap image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.f31998a.a(new gp0.b(image));
        }
    }

    public static final class c implements lb1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f31999a;

        public c(bp0 bp0Var) {
            List listA = bp0Var.a();
            ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
            Iterator it8 = listA.iterator();
            while (it8.hasNext()) {
                arrayList.add(((wo0) it8.next()).getId());
            }
            this.f31999a = arrayList;
        }

        @Override // com.fourthline.orca.internal.lb1
        public void a(uo0 type) {
            Intrinsics.checkNotNullParameter(type, "type");
        }

        @Override // com.fourthline.orca.internal.lb1
        public List getSupportedTypes() {
            return this.f31999a;
        }
    }

    public final cp0 a(mp0 dataBundle) {
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        return new b(dataBundle);
    }

    public final lb1 b(bp0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        return new c(repository);
    }

    public final ox a(g8 decoderFromUri) {
        Intrinsics.checkNotNullParameter(decoderFromUri, "decoderFromUri");
        return new jp0(decoderFromUri);
    }

    public final ep0 a(bp0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        return new ep0(repository);
    }

    public final bp0 a(an0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        return new a(flowConfig);
    }

    public final aq0 a(vo0 analytics, bn0 flowCoordinator, bq0 popupHandlerBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return popupHandlerBuilder.a(new xo0(imageServiceLocator), new yo0(flowCoordinator, analytics, imageServiceLocator), new ap0(imageServiceLocator), new zo0(imageServiceLocator));
    }

    public final ob1 a(bn0 flowCoordinator, ep0 stateProvider, lb1 repository, aq0 popupHandler, qp0 finishScreenHandler, sg0 tracker, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(finishScreenHandler, "finishScreenHandler");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new ob1(new f80(stateProvider), stateProvider, flowCoordinator, new hb1(ib1.a(pp0.f32018a), mm0.f31223a), finishScreenHandler, repository, new db1(tracker), popupHandler, coroutineScope);
    }

    public final qp0 a() {
        return new qp0();
    }

    public final fp0 a(ob1 typeSelectViewModel, bn0 flowCoordinator, g8 bitmapDecoderFromUri, qx fileWriterFromUri, cp0 resultRepository, vo0 analytics, aq0 popupHandler, ox fileValidator, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(typeSelectViewModel, "typeSelectViewModel");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(bitmapDecoderFromUri, "bitmapDecoderFromUri");
        Intrinsics.checkNotNullParameter(fileWriterFromUri, "fileWriterFromUri");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(fileValidator, "fileValidator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new fp0(typeSelectViewModel, new wr(coroutineScope), flowCoordinator, resultRepository, bitmapDecoderFromUri, fileWriterFromUri, analytics, popupHandler, fileValidator, coroutineScope);
    }
}
