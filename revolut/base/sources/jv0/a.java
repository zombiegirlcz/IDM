package jv0;

import androidx.media3.datasource.BaseDataSource;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.RawResourceDataSource;
import com.revolut.camerakit.ui.views.view.player.CameraKitPlayer;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements DataSource.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseDataSource f178733b;

    public /* synthetic */ a(BaseDataSource baseDataSource, int i) {
        this.f178732a = i;
        this.f178733b = baseDataSource;
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public final DataSource createDataSource() {
        int i = this.f178732a;
        BaseDataSource baseDataSource = this.f178733b;
        switch (i) {
            case 0:
                return (RawResourceDataSource) baseDataSource;
            default:
                FileDataSource fileDataSource = (FileDataSource) baseDataSource;
                int i2 = CameraKitPlayer.f;
                return fileDataSource;
        }
    }
}
