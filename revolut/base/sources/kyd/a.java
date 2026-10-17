package kyd;

import ch.qos.logback.core.CoreConstants;
import hyd.i;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f190694a = new DateTimeFormatterBuilder().appendValue(ChronoField.DAY_OF_MONTH, 2).appendLiteral(CoreConstants.DASH_CHAR).appendValue(ChronoField.MONTH_OF_YEAR, 2).parseDefaulting(ChronoField.YEAR, 0).toFormatter();

    public static final String a(String str) {
        if (str == null || d0.W(str)) {
            return null;
        }
        return str;
    }

    public static final wxd.e b(i iVar) {
        String value;
        String strA;
        JsonObject jsonObject;
        String value2;
        String str = iVar.f156803a;
        int iHashCode = str.hashCode();
        if (iHashCode != -407029972) {
            if (iHashCode != 629233382) {
                if (iHashCode == 1810371957 && str.equals("generate") && (jsonObject = iVar.d) != null) {
                    Object obj2 = jsonObject.get("productId");
                    kotlinx.serialization.json.b bVar = obj2 instanceof kotlinx.serialization.json.b ? (kotlinx.serialization.json.b) obj2 : null;
                    if (bVar == null || !bVar.b() || d0.W(bVar.a())) {
                        value2 = null;
                    } else {
                        value2 = jsonObject.toString();
                        Intrinsics.checkNotNullParameter(value2, "value");
                    }
                    if (value2 != null) {
                        return new wxd.d(value2);
                    }
                }
            } else if (str.equals("deeplink") && (strA = a(iVar.f156804b)) != null) {
                return new wxd.b(strA);
            }
        } else if (str.equals("document_download") && (value = a(iVar.f156805c)) != null) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new wxd.c(value);
        }
        return null;
    }
}
