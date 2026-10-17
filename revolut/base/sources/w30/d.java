package w30;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lw30/d;", "", "", "key", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "BUSY", "NO_ANSWER", "CANCELED", "FAILED", "DROPPED_WHILE_WAITING_FOR_AGENT", "CLIENT_CONNECTION_ISSUES", "OTHER", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @lg.b("Busy")
    public static final d BUSY;

    @lg.b("Canceled")
    public static final d CANCELED;

    @lg.b("ClientConnectionIssues")
    public static final d CLIENT_CONNECTION_ISSUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @lg.b("DroppedWhileWaitingForAgent")
    public static final d DROPPED_WHILE_WAITING_FOR_AGENT;

    @lg.b("Failed")
    public static final d FAILED;

    @lg.b("NoAnswer")
    public static final d NO_ANSWER;

    @lg.b("Other")
    public static final d OTHER;

    @NotNull
    private final String key;

    /* JADX INFO: renamed from: w30.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static d a(String str) {
            Object next;
            Iterator<E> it8 = d.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((d) next).getKey(), str)) {
                    break;
                }
            }
            d dVar = (d) next;
            return dVar == null ? d.OTHER : dVar;
        }
    }

    static {
        d dVar = new d("BUSY", 0, "Busy");
        BUSY = dVar;
        d dVar2 = new d("NO_ANSWER", 1, "NoAnswer");
        NO_ANSWER = dVar2;
        d dVar3 = new d("CANCELED", 2, "Canceled");
        CANCELED = dVar3;
        d dVar4 = new d("FAILED", 3, "Failed");
        FAILED = dVar4;
        d dVar5 = new d("DROPPED_WHILE_WAITING_FOR_AGENT", 4, "DroppedWhileWaitingForAgent");
        DROPPED_WHILE_WAITING_FOR_AGENT = dVar5;
        d dVar6 = new d("CLIENT_CONNECTION_ISSUES", 5, "ClientConnectionIssues");
        CLIENT_CONNECTION_ISSUES = dVar6;
        d dVar7 = new d("OTHER", 6, "Other");
        OTHER = dVar7;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
        INSTANCE = new Companion();
    }

    public d(String str, int i, String str2) {
        this.key = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
