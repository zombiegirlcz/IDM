package l38;

import com.revolut.core.model.account.AccountId;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import n38.y;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final String a(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(yVar.f211969c, " ", yVar.d);
    }

    public static final y b(n38.a aVar, String currentUserId) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        for (y yVar : aVar.d) {
            if (!Intrinsics.f(yVar.f211967a, currentUserId)) {
                return yVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final AccountId.Joint c(n38.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new AccountId.Joint(aVar.f211923a, aVar.f211924b);
    }
}
