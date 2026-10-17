package m9;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import p9.p;
import p9.s;
import p9.y;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TimeZone f203589h = TimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.f f203590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f203591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f203592c;
    public final dl.a d;
    public final DateFormat e;
    public final Locale f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.core.b f203593g;

    public a(s sVar, y yVar, w9.f fVar, DateFormat dateFormat, Locale locale, com.fasterxml.jackson.core.b bVar, dl.a aVar) {
        this.f203591b = sVar;
        this.f203592c = yVar;
        this.f203590a = fVar;
        this.e = dateFormat;
        this.f = locale;
        this.f203593g = bVar;
        this.d = aVar;
    }
}
