package r51;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final boolean a(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        return LocalDate.now().compareTo((ReadablePartial) new LocalDate(dateTime)) == 0;
    }
}
