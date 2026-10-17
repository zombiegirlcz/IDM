package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DocumentType;
import com.fourthline.core.eid.EidServiceProvider;
import com.fourthline.orca.internal.ff0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class xu {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[as.values().length];
            try {
                iArr[as.f26892a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[as.f26893b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[as.f26894c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final lf0 a(mf0 nfcScannerVideos, l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(nfcScannerVideos, "nfcScannerVideos");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new sf0(new ht1(nfcScannerVideos, 6), lottieServiceLocator.a(k70.f30152g), imageServiceLocator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff0.a.InterfaceC0196a a(mf0 mf0Var) {
        return (ff0.a.InterfaceC0196a) mf0Var.invoke(DocumentType.ID_CARD);
    }

    public final ev a(bs bundle, Context context) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(context, "context");
        return new fv(bundle, context);
    }

    public final iv a(bs bundle, EidServiceProvider eidServiceProvider) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(eidServiceProvider, "eidServiceProvider");
        int i = a.$EnumSwitchMapping$0[bundle.b().ordinal()];
        if (i == 1) {
            return new lv(bundle, eidServiceProvider);
        }
        if (i == 2) {
            return new gv(bundle, eidServiceProvider);
        }
        if (i == 3) {
            return new kv(bundle, eidServiceProvider);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final jv a(lf0 stateProvider, ws flowCoordinator, ev repository, bq0 popupHandlerBuilder, v10 imageServiceLocator, l70 lottieServiceLocator, iv eidScannerUseCase, bs eidBundle, Context context, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(eidScannerUseCase, "eidScannerUseCase");
        Intrinsics.checkNotNullParameter(eidBundle, "eidBundle");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        wr wrVar = new wr(coroutineScope);
        return new jv(new f80(stateProvider), wrVar, stateProvider, flowCoordinator, repository, eidScannerUseCase, popupHandlerBuilder.a(new dv(lottieServiceLocator, wrVar, flowCoordinator, repository), new wu(flowCoordinator, imageServiceLocator, eidBundle), new tu(flowCoordinator, imageServiceLocator, eidBundle), new vu(flowCoordinator, imageServiceLocator, eidBundle), new ru(flowCoordinator, imageServiceLocator, eidBundle, context), new su(flowCoordinator, imageServiceLocator, eidBundle), new uu(flowCoordinator, imageServiceLocator, eidBundle)), coroutineScope);
    }
}
