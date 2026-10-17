package w30;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lw30/h;", "", "", "key", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "IN_APP", "PHONE", "OTHER", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @lg.b("InApp")
    public static final h IN_APP;

    @lg.b("Other")
    public static final h OTHER;

    @lg.b("Phone")
    public static final h PHONE;

    @NotNull
    private final String key;

    /* JADX INFO: renamed from: w30.h$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static h a(String str) {
            Object next;
            Iterator<E> it8 = h.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((h) next).getKey(), str)) {
                    break;
                }
            }
            h hVar = (h) next;
            return hVar == null ? h.OTHER : hVar;
        }
    }

    static {
        h hVar = new h("IN_APP", 0, "InApp");
        IN_APP = hVar;
        h hVar2 = new h("PHONE", 1, "Phone");
        PHONE = hVar2;
        h hVar3 = new h("OTHER", 2, "Other");
        OTHER = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
        INSTANCE = new Companion();
    }

    public h(String str, int i, String str2) {
        this.key = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
