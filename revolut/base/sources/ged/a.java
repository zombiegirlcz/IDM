package ged;

import com.google.gson.reflect.TypeToken;
import he0.d;
import he0.e;
import he0.f;
import he0.h;
import he0.j;
import he0.k;
import he0.o;
import java.time.Instant;
import java.time.Period;
import java.time.ZonedDateTime;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private a() {
    }

    public static p a() {
        p pVar = new p();
        b(pVar);
        return pVar;
    }

    public static void b(p builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.c(new k(), new TypeToken<String>() { // from class: com.revolut.feature.shared.wealth.data.gson.SharedWealthGsonConfigurator$configure$1
        }.getType());
        builder.c(new o(), ZonedDateTime.class);
        builder.c(new he0.a(), DateTime.class);
        builder.c(new j(), LocalDate.class);
        builder.c(new e(), Instant.class);
        builder.c(new f(), java.time.LocalDate.class);
        builder.c(new h(), Period.class);
        builder.e.add(new d());
        Intrinsics.checkNotNullExpressionValue(builder, "registerTypeAdapterFactory(...)");
    }
}
