package tyd;

import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.feature.statements.api.navigation.StatementOfFeesDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f275563a = y0.b("documents/statement-of-fees");

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f275563a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new StatementOfFeesDestination(StatementProductType.PERSONAL_CURRENT, null, null);
    }
}
