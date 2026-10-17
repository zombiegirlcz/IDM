package androidx.room;

import aim.o;
import androidx.room.InvalidationTracker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011H\u0000¢\u0006\u0002\b\u0016J\u001b\u0010\u0017\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0000¢\u0006\u0002\b\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/room/ObserverWrapper;", "", "observer", "Landroidx/room/InvalidationTracker$Observer;", "tableIds", "", "tableNames", "", "", "<init>", "(Landroidx/room/InvalidationTracker$Observer;[I[Ljava/lang/String;)V", "getObserver$room_runtime_release", "()Landroidx/room/InvalidationTracker$Observer;", "getTableIds$room_runtime_release", "()[I", "[Ljava/lang/String;", "singleTableSet", "", "notifyByTableIds", "", "invalidatedTablesIds", "", "notifyByTableIds$room_runtime_release", "notifyByTableNames", "invalidatedTablesNames", "notifyByTableNames$room_runtime_release", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ObserverWrapper {

    @NotNull
    private final InvalidationTracker.Observer observer;

    @NotNull
    private final Set<String> singleTableSet;

    @NotNull
    private final int[] tableIds;

    @NotNull
    private final String[] tableNames;

    public ObserverWrapper(@NotNull InvalidationTracker.Observer observer, @NotNull int[] tableIds, @NotNull String[] tableNames) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.observer = observer;
        this.tableIds = tableIds;
        this.tableNames = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = !(tableNames.length == 0) ? y0.b(tableNames[0]) : h0.f322473a;
    }

    @NotNull
    /* JADX INFO: renamed from: getObserver$room_runtime_release, reason: from getter */
    public final InvalidationTracker.Observer getObserver() {
        return this.observer;
    }

    @NotNull
    /* JADX INFO: renamed from: getTableIds$room_runtime_release, reason: from getter */
    public final int[] getTableIds() {
        return this.tableIds;
    }

    public final void notifyByTableIds$room_runtime_release(@NotNull Set<Integer> invalidatedTablesIds) {
        Set<String> setA;
        Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                o oVar = new o();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i]))) {
                        oVar.add(this.tableNames[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                setA = y0.a(oVar);
            } else {
                setA = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : h0.f322473a;
            }
        } else {
            setA = h0.f322473a;
        }
        if (setA.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setA);
    }

    public final void notifyByTableNames$room_runtime_release(@NotNull Set<String> invalidatedTablesNames) {
        Set<String> setA;
        Intrinsics.checkNotNullParameter(invalidatedTablesNames, "invalidatedTablesNames");
        int length = this.tableNames.length;
        if (length == 0) {
            setA = h0.f322473a;
        } else if (length != 1) {
            o oVar = new o();
            for (String str : invalidatedTablesNames) {
                String[] strArr = this.tableNames;
                int length2 = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length2) {
                        String str2 = strArr[i];
                        if (a0.z(str2, str, true)) {
                            oVar.add(str2);
                            break;
                        }
                        i++;
                    }
                }
            }
            setA = y0.a(oVar);
        } else {
            Set<String> set = invalidatedTablesNames;
            if ((set instanceof Collection) && set.isEmpty()) {
                setA = h0.f322473a;
            } else {
                Iterator<T> it8 = set.iterator();
                while (it8.hasNext()) {
                    if (a0.z((String) it8.next(), this.tableNames[0], true)) {
                        setA = this.singleTableSet;
                        break;
                    }
                }
                setA = h0.f322473a;
            }
        }
        if (setA.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setA);
    }
}
