package jf0;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f173628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173629c;
    public final HashMap d;
    public final String e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f173630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f173631h;
    public final Lazy i;

    public c(String originalUri, e type, String uri2, HashMap parameters, String str) {
        Intrinsics.checkNotNullParameter(originalUri, "originalUri");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f173627a = originalUri;
        this.f173628b = type;
        this.f173629c = uri2;
        this.d = parameters;
        this.e = str;
        final int i = 0;
        this.f = j.b(new Function0(this) { // from class: jf0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f173626b;

            {
                this.f173626b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String path;
                int i2 = i;
                boolean z = false;
                c cVar = this.f173626b;
                switch (i2) {
                    case 0:
                        try {
                            return URI.create(cVar.f173629c);
                        } catch (Exception e) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                            return null;
                        }
                    case 1:
                        URI uri3 = (URI) cVar.f.getValue();
                        if (uri3 != null && (path = uri3.getPath()) != null) {
                            objN0 = d0.n0(path, new String[]{"/"}, 0, 6);
                        }
                        return objN0 == null ? f0.f322471a : objN0;
                    case 2:
                        URI uri4 = (URI) cVar.f.getValue();
                        objN0 = uri4 != null ? uri4.getAuthority() : null;
                        return objN0 == null ? "" : objN0;
                    default:
                        List listH = cVar.h();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listH) {
                            if (z) {
                                arrayList.add(obj2);
                            } else if (((String) obj2).length() != 0) {
                                arrayList.add(obj2);
                                z = true;
                            }
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        this.f173630g = j.b(new Function0(this) { // from class: jf0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f173626b;

            {
                this.f173626b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String path;
                int i22 = i2;
                boolean z = false;
                c cVar = this.f173626b;
                switch (i22) {
                    case 0:
                        try {
                            return URI.create(cVar.f173629c);
                        } catch (Exception e) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                            return null;
                        }
                    case 1:
                        URI uri3 = (URI) cVar.f.getValue();
                        if (uri3 != null && (path = uri3.getPath()) != null) {
                            objN0 = d0.n0(path, new String[]{"/"}, 0, 6);
                        }
                        return objN0 == null ? f0.f322471a : objN0;
                    case 2:
                        URI uri4 = (URI) cVar.f.getValue();
                        objN0 = uri4 != null ? uri4.getAuthority() : null;
                        return objN0 == null ? "" : objN0;
                    default:
                        List listH = cVar.h();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listH) {
                            if (z) {
                                arrayList.add(obj2);
                            } else if (((String) obj2).length() != 0) {
                                arrayList.add(obj2);
                                z = true;
                            }
                        }
                        return arrayList;
                }
            }
        });
        final int i3 = 2;
        this.f173631h = j.b(new Function0(this) { // from class: jf0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f173626b;

            {
                this.f173626b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String path;
                int i22 = i3;
                boolean z = false;
                c cVar = this.f173626b;
                switch (i22) {
                    case 0:
                        try {
                            return URI.create(cVar.f173629c);
                        } catch (Exception e) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                            return null;
                        }
                    case 1:
                        URI uri3 = (URI) cVar.f.getValue();
                        if (uri3 != null && (path = uri3.getPath()) != null) {
                            objN0 = d0.n0(path, new String[]{"/"}, 0, 6);
                        }
                        return objN0 == null ? f0.f322471a : objN0;
                    case 2:
                        URI uri4 = (URI) cVar.f.getValue();
                        objN0 = uri4 != null ? uri4.getAuthority() : null;
                        return objN0 == null ? "" : objN0;
                    default:
                        List listH = cVar.h();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listH) {
                            if (z) {
                                arrayList.add(obj2);
                            } else if (((String) obj2).length() != 0) {
                                arrayList.add(obj2);
                                z = true;
                            }
                        }
                        return arrayList;
                }
            }
        });
        final int i5 = 3;
        this.i = j.b(new Function0(this) { // from class: jf0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f173626b;

            {
                this.f173626b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String path;
                int i22 = i5;
                boolean z = false;
                c cVar = this.f173626b;
                switch (i22) {
                    case 0:
                        try {
                            return URI.create(cVar.f173629c);
                        } catch (Exception e) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                            return null;
                        }
                    case 1:
                        URI uri3 = (URI) cVar.f.getValue();
                        if (uri3 != null && (path = uri3.getPath()) != null) {
                            objN0 = d0.n0(path, new String[]{"/"}, 0, 6);
                        }
                        return objN0 == null ? f0.f322471a : objN0;
                    case 2:
                        URI uri4 = (URI) cVar.f.getValue();
                        objN0 = uri4 != null ? uri4.getAuthority() : null;
                        return objN0 == null ? "" : objN0;
                    default:
                        List listH = cVar.h();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listH) {
                            if (z) {
                                arrayList.add(obj2);
                            } else if (((String) obj2).length() != 0) {
                                arrayList.add(obj2);
                                z = true;
                            }
                        }
                        return arrayList;
                }
            }
        });
    }

    public final String a() {
        return e(1);
    }

    public final String b() {
        return e(4);
    }

    public final String c() {
        return this.f173627a;
    }

    public final Map d() {
        return this.d;
    }

    public final String e(int i) {
        List listH = h();
        return listH.size() > i ? (String) listH.get(i) : "";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f173627a, cVar.f173627a) && this.f173628b == cVar.f173628b && Intrinsics.f(this.f173629c, cVar.f173629c) && this.d.equals(cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return e(2);
    }

    public final List h() {
        return (List) this.f173630g.getValue();
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c((this.f173628b.hashCode() + (this.f173627a.hashCode() * 31)) * 31, 31, this.f173629c)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String i() {
        return e(3);
    }

    public final e j() {
        return this.f173628b;
    }

    public final String k() {
        return this.f173629c;
    }

    public final boolean l() {
        return !Intrinsics.f(this.d.get("presentation_type"), "inline");
    }
}
