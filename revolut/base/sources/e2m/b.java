package e2m;

import android.content.Context;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import eg.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f122151h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Context context, int i) {
        super(0);
        this.f = i;
        this.f122151h = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                Context context = this.f122151h;
                Intrinsics.checkNotNullParameter(context, "context");
                return new m2m.a();
            case 1:
                return PreferenceDataStoreFile.preferencesDataStoreFile(this.f122151h, g0.f125437b);
            default:
                return PreferenceDataStoreFile.preferencesDataStoreFile(this.f122151h, g0.f125436a);
        }
    }
}
