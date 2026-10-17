package eg;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements hg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f125469b;

    public /* synthetic */ n(phm.a aVar, int i) {
        this.f125468a = i;
        this.f125469b = aVar;
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f125468a;
        phm.a aVar = this.f125469b;
        switch (i) {
            case 0:
                return new m((cf.b) ((hg.c) aVar).f152040a);
            case 1:
                pd.g firebaseApp = (pd.g) ((hg.c) aVar).f152040a;
                t.Companion.getClass();
                Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
                t0 t0Var = t0.f125493a;
                return t0.a(firebaseApp);
            case 2:
                Context appContext = (Context) ((hg.c) aVar).f152040a;
                t.Companion.getClass();
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                DataStore dataStoreCreate$default = PreferenceDataStoreFactory.create$default(PreferenceDataStoreFactory.INSTANCE, new ReplaceFileCorruptionHandler(r.f125485h), null, null, new e2m.b(appContext, 1), 6, null);
                if (dataStoreCreate$default != null) {
                    return dataStoreCreate$default;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 3:
                Context appContext2 = (Context) ((hg.c) aVar).f152040a;
                t.Companion.getClass();
                Intrinsics.checkNotNullParameter(appContext2, "appContext");
                DataStore dataStoreCreate$default2 = PreferenceDataStoreFactory.create$default(PreferenceDataStoreFactory.INSTANCE, new ReplaceFileCorruptionHandler(r.i), null, null, new e2m.b(appContext2, 2), 6, null);
                if (dataStoreCreate$default2 != null) {
                    return dataStoreCreate$default2;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 4:
                return new m1((Context) ((hg.c) aVar).f152040a);
            case 5:
                return new ig.b((Context) ((hg.c) aVar).f152040a);
            default:
                return new ig.o((DataStore) aVar.get());
        }
    }
}
