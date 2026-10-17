package a19;

import com.revolut.feature.licenses.impl.ui.licenses.model.LibraryItem;
import com.revolut.feature.licenses.impl.ui.licenses.model.LicenseItem;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f563a;

    public c(a assetsProvider) {
        Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
        this.f563a = assetsProvider;
    }

    public final InputStream a(String fileName) throws IOException {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        InputStream inputStreamOpen = this.f563a.f562a.getContext().getAssets().open(fileName);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        return inputStreamOpen;
    }

    public final ArrayList b() {
        LicenseItem licenseItem;
        Object next;
        InputStream inputStreamA = a("libraries.json");
        try {
            Lazy lazy = g.f567a;
            Json json = (Json) lazy.getValue();
            json.getClass();
            List list = (List) i2b.a.d(json, new qlm.e(b19.c.Companion.serializer()), inputStreamA);
            inputStreamA.close();
            inputStreamA = a("licenses.json");
            try {
                Json json2 = (Json) lazy.getValue();
                json2.getClass();
                List list2 = (List) i2b.a.d(json2, new qlm.e(b19.f.Companion.serializer()), inputStreamA);
                inputStreamA.close();
                List<b19.c> list3 = list;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                for (b19.c cVar : list3) {
                    Iterator it8 = list2.iterator();
                    while (true) {
                        licenseItem = null;
                        if (!it8.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it8.next();
                        if (a0.z(cVar.f, ((b19.f) next).f11752a, true)) {
                            break;
                        }
                    }
                    b19.f fVar = (b19.f) next;
                    LibraryItem.Companion companion = LibraryItem.INSTANCE;
                    if (fVar != null) {
                        LicenseItem.INSTANCE.getClass();
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        licenseItem = new LicenseItem(fVar.f11752a, fVar.f11753b, fVar.f11754c, fVar.d);
                    }
                    if (licenseItem == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    companion.getClass();
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    Intrinsics.checkNotNullParameter(licenseItem, "licenseItem");
                    arrayList.add(new LibraryItem(cVar.f11748a, cVar.f11749b, cVar.f11750c, cVar.d, cVar.e, licenseItem));
                }
                return arrayList;
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
