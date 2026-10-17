package w30;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lw30/g;", "", "", "key", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "CREATED", "IN_PROGRESS", "COMPLETED", "SCHEDULED", "OTHER", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @lg.b("Completed")
    public static final g COMPLETED;

    @lg.b("Created")
    public static final g CREATED;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @lg.b("InProgress")
    public static final g IN_PROGRESS;

    @lg.b("Other")
    public static final g OTHER;

    @lg.b("Scheduled")
    public static final g SCHEDULED;

    @NotNull
    private final String key;

    /* JADX INFO: renamed from: w30.g$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static g a(String str) {
            Object next;
            Iterator<E> it8 = g.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((g) next).getKey(), str)) {
                    break;
                }
            }
            g gVar = (g) next;
            return gVar == null ? g.OTHER : gVar;
        }
    }

    static {
        g gVar = new g("CREATED", 0, "Created");
        CREATED = gVar;
        g gVar2 = new g("IN_PROGRESS", 1, "InProgress");
        IN_PROGRESS = gVar2;
        g gVar3 = new g("COMPLETED", 2, "Completed");
        COMPLETED = gVar3;
        g gVar4 = new g("SCHEDULED", 3, "Scheduled");
        SCHEDULED = gVar4;
        g gVar5 = new g("OTHER", 4, "Other");
        OTHER = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
        INSTANCE = new Companion();
    }

    public g(String str, int i, String str2) {
        this.key = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
