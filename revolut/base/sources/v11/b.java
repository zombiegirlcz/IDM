package v11;

import com.revolut.data.database.AppRoomDatabase;
import com.revolut.data.database.models.beneficiary.BeneficiaryDao;
import com.revolut.data.database.models.beneficiary.BeneficiaryEntity;
import com.revolut.data.database.models.beneficiary.mapper.BeneficiaryEntityMapperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import ue0.c;
import ulm.p0;
import yhm.j;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppRoomDatabase f285202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f285203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f285204c;

    public b(AppRoomDatabase database, c storage) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f285202a = database;
        this.f285203b = storage;
        this.f285204c = j.b(new p0(this, 4));
    }

    public final ArrayList a() {
        try {
            List<BeneficiaryEntity> allSync = c().getAllSync();
            ArrayList arrayList = new ArrayList(w.t(allSync, 10));
            Iterator<T> it8 = allSync.iterator();
            while (it8.hasNext()) {
                arrayList.add(BeneficiaryEntityMapperKt.toDomain((BeneficiaryEntity) it8.next()));
            }
            return arrayList;
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public final f5j.a b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        try {
            BeneficiaryEntity byIdSync = c().getByIdSync(id10);
            if (byIdSync != null) {
                return BeneficiaryEntityMapperKt.toDomain(byIdSync);
            }
            return null;
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public final BeneficiaryDao c() {
        return (BeneficiaryDao) this.f285204c.getValue();
    }

    public final void d(f5j.a entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        c().insert(BeneficiaryEntityMapperKt.toEntity(entity));
    }
}
