package eli;

import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomController;
import efm.h0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements kfm.o, zk0.c, kfm.g, kfm.p, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f127483b;

    public /* synthetic */ k(Object obj2, int i) {
        this.f127482a = i;
        this.f127483b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f127482a) {
            case 6:
                ((er5.a) this.f127483b).invoke(obj2);
                break;
            case 15:
                ((er9.i) this.f127483b).invoke(obj2);
                break;
            case 20:
                ((er9.i) this.f127483b).invoke(obj2);
                break;
            case 25:
                ((er9.h) this.f127483b).invoke(obj2);
                break;
            default:
                ((er9.i) this.f127483b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f127482a;
        Object obj2 = this.f127483b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 1:
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 15:
            case 20:
            case 25:
            case 27:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                KProperty[] kPropertyArr = CategoryManagementCustomController.T;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (h0) ((er9.h) obj2).invoke(p0);
    }

    @Override // zk0.c
    public void g(FileOutputStream outputStream) throws IOException {
        switch (this.f127482a) {
            case 1:
                InputStream inputStream = (InputStream) this.f127483b;
                Intrinsics.checkNotNullParameter(outputStream, "outputStream");
                zi0.c.m(inputStream, outputStream, 8192);
                break;
            default:
                outputStream.write((byte[]) this.f127483b);
                break;
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        eqd.h hVar = (eqd.h) this.f127483b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) hVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        switch (this.f127482a) {
            case 8:
                er9.a aVar = (er9.a) this.f127483b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (List) aVar.invoke(p0, p17);
            default:
                er9.a aVar2 = (er9.a) this.f127483b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (List) aVar2.invoke(p0, p17);
        }
    }
}
