package js6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import kotlin.Lazy;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f178144a;

    public i() {
        Lazy lazy = l57.a.f192185a;
        this.f178144a = (Json) l57.a.f192185a.getValue();
    }

    public final String a(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return this.f178144a.c(ie0.n.f160612a, localDateTime);
        }
        return null;
    }

    public final String b(LocalDate localDate) {
        if (localDate != null) {
            return this.f178144a.c(ie0.m.f160609a, localDate);
        }
        return null;
    }

    public final LocalDate c(String str) {
        if (str != null) {
            return (LocalDate) this.f178144a.b(ie0.m.f160609a, str);
        }
        return null;
    }

    public final LocalDateTime d(String str) {
        if (str != null) {
            return (LocalDateTime) this.f178144a.b(ie0.n.f160612a, str);
        }
        return null;
    }
}
