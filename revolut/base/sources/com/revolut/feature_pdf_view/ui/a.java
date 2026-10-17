package com.revolut.feature_pdf_view.ui;

import a80.h;
import android.net.Uri;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import efm.d0;
import g9i.k;
import g9i.m;
import g9i.n;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import o80.c;
import tqi.g;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f97463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f97464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk0.b f97465c;
    public final f80.a d;
    public final g e;

    public a(k presentationModel, n state, zk0.b fileSystemRepository, f80.a uriHelper, g shareNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        this.f97463a = presentationModel;
        this.f97464b = state;
        this.f97465c = fileSystemRepository;
        this.d = uriHelper;
        this.e = shareNaviCommandFactory;
    }

    public final ufm.b a(String str) {
        ufm.b bVarM = d0.m(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, ((f80.b) this.d).f(str), 14), null, null, null, 0, null, null, null, null, false, 1022));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final ufm.b b(File file) {
        Uri uriI = ((h) this.f97465c).i(file);
        Intrinsics.checkNotNullParameter(file, "file");
        String strD = c.d(file);
        tqi.h hVar = new tqi.h(uriI);
        if (strD == null) {
            strD = "application/pdf";
        }
        tqi.c cVar = new tqi.c(null, null, hVar, strD, 23);
        m70.a.c(t0.f186434a);
        ufm.b bVarM = d0.m(this.e.g(cVar, ""));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
