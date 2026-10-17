package u90;

import com.revolut.feature.backend_flow.domain.models.BackendFlowBinary;
import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q90.l4;
import q90.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class b {
    public b(zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
    }

    public static n1 b(List files) {
        l4 l4Var;
        Intrinsics.checkNotNullParameter(files, "files");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = files.iterator();
        while (it8.hasNext()) {
            BackendFlowBinary backendFlowBinary = (BackendFlowBinary) it8.next();
            String str = ((BackendFlowFile) backendFlowBinary).d;
            if (str == null) {
                l4Var = null;
            } else {
                if (!(backendFlowBinary instanceof BackendFlowFile)) {
                    throw new NoWhenBranchMatchedException();
                }
                String absolutePath = ((BackendFlowFile) backendFlowBinary).f63281g.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                l4Var = new l4(str, absolutePath);
            }
            if (l4Var != null) {
                arrayList.add(l4Var);
            }
        }
        return new n1(arrayList);
    }

    public final ArrayList a(n1 n1Var) {
        List files = n1Var != null ? n1Var.getFiles() : null;
        if (files == null) {
            files = zhm.f0.f322471a;
        }
        List<l4> list = files;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (l4 l4Var : list) {
            String id10 = l4Var.getId();
            String pathname = l4Var.getName();
            BackendFlowBinary.Companion companion = BackendFlowBinary.INSTANCE;
            Intrinsics.checkNotNullParameter(pathname, "pathname");
            arrayList.add(BackendFlowFile.a(BackendFlowBinary.Companion.a(companion, new File(pathname), null, null, 6), id10, null, null, 59));
        }
        return arrayList;
    }
}
