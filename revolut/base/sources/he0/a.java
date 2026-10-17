package he0;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kg.x;
import kg.y;
import kg.z;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f151502a = ISODateTimeFormat.dateTimeParser().withZoneUTC();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f151503b = ISODateTimeFormat.dateTime().withZoneUTC();

    @Override // kg.t
    public final Object deserialize(u json, Type typeOfT, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        String strF = json.f();
        Intrinsics.h(strF);
        if (strF.length() == 0) {
            throw new JsonParseException("Empty time string");
        }
        DateTime dateTime = this.f151502a.parseDateTime(strF);
        Intrinsics.checkNotNullExpressionValue(dateTime, "parseDateTime(...)");
        return dateTime;
    }

    @Override // kg.z
    public final u serialize(Object obj2, Type typeOfSrc, y context) {
        DateTime src2 = (DateTime) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(typeOfSrc, "typeOfSrc");
        Intrinsics.checkNotNullParameter(context, "context");
        return new x(this.f151503b.print(src2));
    }
}
