package androidx.room.util;

import androidx.room.DatabaseConfiguration;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0000\u001a:\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¨\u0006\u0013"}, d2 = {"isMigrationRequired", "", "Landroidx/room/DatabaseConfiguration;", "fromVersion", "", "toVersion", "contains", "Landroidx/room/RoomDatabase$MigrationContainer;", "startVersion", "endVersion", "findMigrationPath", "", "Landroidx/room/migration/Migration;", "start", "end", "findUpMigrationPath", "result", "", "upgrade", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class MigrationUtil {
    public static final boolean contains(@NotNull RoomDatabase.MigrationContainer migrationContainer, int i, int i2) {
        Intrinsics.checkNotNullParameter(migrationContainer, "<this>");
        Map<Integer, Map<Integer, Migration>> migrations = migrationContainer.getMigrations();
        if (!migrations.containsKey(Integer.valueOf(i))) {
            return false;
        }
        Map<Integer, Migration> mapG = migrations.get(Integer.valueOf(i));
        if (mapG == null) {
            mapG = r0.g();
        }
        return mapG.containsKey(Integer.valueOf(i2));
    }

    public static final List<Migration> findMigrationPath(@NotNull RoomDatabase.MigrationContainer migrationContainer, int i, int i2) {
        Intrinsics.checkNotNullParameter(migrationContainer, "<this>");
        if (i == i2) {
            return f0.f322471a;
        }
        return findUpMigrationPath(migrationContainer, new ArrayList(), i2 > i, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<Migration> findUpMigrationPath(RoomDatabase.MigrationContainer migrationContainer, List<Migration> list, boolean z, int i, int i2) {
        int iIntValue;
        boolean z3;
        while (true) {
            if (z) {
                if (i >= i2) {
                    return list;
                }
            } else if (i <= i2) {
                return list;
            }
            Pair<Map<Integer, Migration>, Iterable<Integer>> sortedDescendingNodes$room_runtime_release = z ? migrationContainer.getSortedDescendingNodes$room_runtime_release(i) : migrationContainer.getSortedNodes$room_runtime_release(i);
            if (sortedDescendingNodes$room_runtime_release == null) {
                return null;
            }
            Map map = (Map) sortedDescendingNodes$room_runtime_release.f186385a;
            Iterator it8 = ((Iterable) sortedDescendingNodes$room_runtime_release.f186386b).iterator();
            while (it8.hasNext()) {
                iIntValue = ((Number) it8.next()).intValue();
                if (!z) {
                    if (i2 <= iIntValue && iIntValue < i) {
                        Object obj2 = map.get(Integer.valueOf(iIntValue));
                        Intrinsics.h(obj2);
                        list.add(obj2);
                        z3 = true;
                        break;
                    }
                } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                    Object obj22 = map.get(Integer.valueOf(iIntValue));
                    Intrinsics.h(obj22);
                    list.add(obj22);
                    z3 = true;
                    break;
                }
            }
            iIntValue = i;
            z3 = false;
            if (!z3) {
                return null;
            }
            i = iIntValue;
        }
    }

    public static final boolean isMigrationRequired(@NotNull DatabaseConfiguration databaseConfiguration, int i, int i2) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "<this>");
        if (i > i2 && databaseConfiguration.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> migrationNotRequiredFrom$room_runtime_release = databaseConfiguration.getMigrationNotRequiredFrom$room_runtime_release();
        return databaseConfiguration.requireMigration && (migrationNotRequiredFrom$room_runtime_release == null || !migrationNotRequiredFrom$room_runtime_release.contains(Integer.valueOf(i)));
    }
}
