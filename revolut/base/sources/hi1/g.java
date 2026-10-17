package hi1;

import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.common.api.R$string;
import com.revolut.feature.address.models.Address;
import java.util.ArrayList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yi1.e f152448a;

    public g(yi1.e addressTypeMapper) {
        Intrinsics.checkNotNullParameter(addressTypeMapper, "addressTypeMapper");
        this.f152448a = addressTypeMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EnumEntries<Address.Type> entries = Address.Type.getEntries();
        ArrayList arrayList = new ArrayList(w.t(entries, 10));
        for (Address.Type type : entries) {
            Address.Type type2 = domainState.f152444a;
            String key = type.getKey();
            this.f152448a.getClass();
            arrayList.add(new SingleChoiceDelegate.Model(key, yi1.e.a(type), type == type2, null, type, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, R$attr.uikit_dp16, 0, 0, 29);
        return new cii.b(null, arrayList, new lw0.a(new TextLocalisedClause(R$string.shared_address_flow_address_type_title, null, null, 14), null, null, null, false, 30));
    }
}
