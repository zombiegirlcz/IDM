package s04;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qu3.i;
import qu3.j;
import qu3.k;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr3.g f258838a;

    public g(dr3.g creditPromptContentDtoMapper) {
        Intrinsics.checkNotNullParameter(creditPromptContentDtoMapper, "creditPromptContentDtoMapper");
        this.f258838a = creditPromptContentDtoMapper;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ht3.a a(String str, String str2) {
        if (str2 != null && str != null) {
            switch (str.hashCode()) {
                case -816666399:
                    if (str.equals("CONFIRM_NO_DEBTS")) {
                        return new i(str2);
                    }
                    break;
                case -424126063:
                    if (str.equals("ADD_DEBT")) {
                        return new qu3.h(str2);
                    }
                    break;
                case 279261536:
                    if (str.equals("OPEN_HUB")) {
                        return new j(str2);
                    }
                    break;
                case 1429093119:
                    if (str.equals("PROCEED_APPLICATION")) {
                        return new k(str2);
                    }
                    break;
            }
        }
        return ht3.h.f155276a;
    }
}
