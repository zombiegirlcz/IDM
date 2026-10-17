package s4j;

import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final C1439a Companion = new C1439a();

    /* JADX INFO: renamed from: s4j.a$a, reason: collision with other inner class name */
    public static final class C1439a {
        private C1439a() {
        }
    }

    public static String a(BankFieldDefinition definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        return j6.a.q("AccountField_", definition.f60271a);
    }
}
