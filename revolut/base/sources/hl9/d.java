package hl9;

import a80.h;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements bl9.a {

    @NotNull
    private static final c Companion = new c();
    public static final List d = v.k("png", "jpg", "jpeg", "pdf");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk0.b f153415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f153416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f153417c;

    public d(zk0.b fileSystemRepository, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f153415a = fileSystemRepository;
        this.f153416b = featureToggleInteractor;
        this.f153417c = hlm.d.a();
    }

    public static final void a(d dVar, String str) {
        dVar.getClass();
        Iterator it8 = d.iterator();
        while (it8.hasNext()) {
            File fileC = dVar.c(str, (String) it8.next());
            if (fileC.exists()) {
                fileC.delete();
            }
        }
    }

    public final File c(String str, String str2) {
        return new File(((h) this.f153415a).k("scanned_bill_details_files"), com.google.android.gms.internal.mlkit_vision_face.a.o(str, ".", str2));
    }
}
