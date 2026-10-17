package s10;

import com.google.gson.reflect.TypeToken;
import com.revolut.chat.domain.model.draft.SelectedUploadDraft;
import java.lang.reflect.Type;
import java.util.List;
import java.util.UUID;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import org.joda.time.Period;
import v30.a0;
import v30.c0;
import w10.j;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    public static String a(c0 c0Var) {
        if (c0Var != null) {
            return c0Var.d();
        }
        return null;
    }

    public static String b(Instant instant) {
        if (instant != null) {
            return instant.toString();
        }
        return null;
    }

    public static String c(UUID uuid) {
        if (uuid != null) {
            return uuid.toString();
        }
        return null;
    }

    public static c0 d(String str) {
        if (str == null) {
            return null;
        }
        c0.Companion.getClass();
        return a0.a(str);
    }

    public static Instant e(String str) {
        if (str != null) {
            return Instant.parse(str);
        }
        return null;
    }

    public static Period f(String str) {
        if (str != null) {
            return Period.parse(str);
        }
        return null;
    }

    public static List g(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = j.a();
        Type type = new TypeToken<List<? extends SelectedUploadDraft>>() { // from class: com.revolut.chat.data.db.converters.ChatTypeConverters$toSelectedUploadDraftList$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }

    public static UUID h(String str) {
        if (str != null) {
            return UUID.fromString(str);
        }
        return null;
    }
}
