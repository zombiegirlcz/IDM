package androidx.media3.datasource;

import androidx.media3.datasource.DefaultHttpDataSource;
import com.google.common.base.Predicate;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7470a;

    public /* synthetic */ a(int i) {
        this.f7470a = i;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj2) {
        switch (this.f7470a) {
            case 0:
                return DefaultHttpDataSource.NullFilteringHeadersMap.lambda$entrySet$1((Map.Entry) obj2);
            default:
                return DefaultHttpDataSource.NullFilteringHeadersMap.lambda$keySet$0((String) obj2);
        }
    }
}
