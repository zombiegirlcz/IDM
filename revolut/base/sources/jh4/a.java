package jh4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import yqi.b;
import yqi.c;
import yqi.d;
import yqi.f;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0990a f174145a = new C0990a();

    /* JADX INFO: renamed from: jh4.a$a, reason: collision with other inner class name */
    public static final class C0990a implements b {
        @Override // yqi.b
        public final Clause a() {
            return new TextLocalisedClause(R$string.credit_application_validation_iban_format, null, null, 14);
        }
    }

    @Override // yqi.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d validate(ih4.b validationData) {
        cnm.a aVar;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        ArrayList arrayList = new ArrayList();
        cnm.a[] DEFAULT_FORMATS = cnm.b.f25473b;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_FORMATS, "DEFAULT_FORMATS");
        int length = DEFAULT_FORMATS.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = DEFAULT_FORMATS[i];
            String str = aVar.f25470a;
            wi0.b bVar = validationData.f161292b;
            if (Intrinsics.f(str, bVar != null ? bVar.f297794a : null)) {
                break;
            }
            i++;
        }
        cnm.b bVar2 = aVar != null ? new cnm.b(aVar) : null;
        if (aVar == null || bVar2 == null) {
            d.Companion.getClass();
            return c.a(validationData);
        }
        if (!bVar2.a(validationData.f161291a)) {
            arrayList.add(this.f174145a);
        }
        return new d(validationData, arrayList);
    }
}
