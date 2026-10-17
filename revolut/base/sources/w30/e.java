package w30;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lw30/e;", "", "", "key", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "CLIENT_TO_AGENT", "AGENT_TO_CLIENT", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @lg.b("Outbound")
    public static final e AGENT_TO_CLIENT;

    @lg.b("Inbound")
    public static final e CLIENT_TO_AGENT;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String key;

    /* JADX INFO: renamed from: w30.e$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static e a(String str) {
            Object next;
            Iterator<E> it8 = e.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((e) next).getKey(), str)) {
                    break;
                }
            }
            return (e) next;
        }
    }

    static {
        e eVar = new e("CLIENT_TO_AGENT", 0, "Inbound");
        CLIENT_TO_AGENT = eVar;
        e eVar2 = new e("AGENT_TO_CLIENT", 1, "Outbound");
        AGENT_TO_CLIENT = eVar2;
        e[] eVarArr = {eVar, eVar2};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
        INSTANCE = new Companion();
    }

    public e(String str, int i, String str2) {
        this.key = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
