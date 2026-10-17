package com.revolut.feature.apm.core.ui.impl.ui.qr.pager;

import ali.b;
import cli.n;
import cli.y;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrFlowInputData;
import com.revolut.feature.apm.core.ui.impl.ui.qr.pager.QrFlowContract$Page;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import oki.h;
import org.jetbrains.annotations.NotNull;
import s32.d;
import s32.e;
import s32.g;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements d {

    @NotNull
    public static final g Companion = new g();
    public final QrFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e60.a f62374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f62375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f62376r;

    public a(QrFlowInputData inputData, e60.a mediaPickerControllerExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f62374p = mediaPickerControllerExtension;
        QrFlowContract$Page.Scanner scanner = QrFlowContract$Page.Scanner.f62373b;
        this.f62375q = mra.d.b(this, new e(v.k(scanner, QrFlowContract$Page.Details.f62372b), scanner.f62371a.getId(), inputData.f62333c, inputData.d), stateMapper, null, false, 12);
        this.f62376r = s.b(this, new rl8.d(this, 28));
    }

    @Override // ali.h
    public final b I0() {
        return this.f62376r;
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f62375q;
    }
}
