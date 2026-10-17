package com.onfido.android.sdk.capture.component.active.video.capture.data.repository;

import com.onfido.android.sdk.capture.ui.OnfidoPresenter;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49874a;

    public /* synthetic */ a(int i) {
        this.f49874a = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f49874a) {
            case 0:
                return ActiveVideoCaptureRepositoryImpl.deleteVideoFiles$lambda$3$lambda$1(file, str);
            case 1:
                return OnfidoPresenter.cleanFiles$lambda$20(file, str);
            case 2:
                return OnfidoPresenter.cleanFiles$lambda$24(file, str);
            default:
                return str.startsWith("LOG_");
        }
    }
}
