package k4;

import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.PlaceholderDataSource;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements DataSource.Factory {
    @Override // androidx.media3.datasource.DataSource.Factory
    public final DataSource createDataSource() {
        return PlaceholderDataSource.a();
    }
}
