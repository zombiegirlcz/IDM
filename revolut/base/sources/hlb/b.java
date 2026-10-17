package hlb;

import com.revolut.feature.shared.savings.models.info_sheets.InfoSheet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f153422a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List infoSheets = (List) obj2;
        Intrinsics.checkNotNullParameter(infoSheets, "infoSheets");
        return (InfoSheet) d0.b0(infoSheets);
    }
}
