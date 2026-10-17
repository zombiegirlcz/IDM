package ia1;

import ga1.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qa1.g;
import qa1.h;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl0.a f159926a;

    public b(tl0.a base64Util) {
        Intrinsics.checkNotNullParameter(base64Util, "base64Util");
        this.f159926a = base64Util;
    }

    public final g a(ga1.d dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String hash = dto.getHash();
        List<e> filesData = dto.getFilesData();
        ArrayList arrayList = new ArrayList(w.t(filesData, 10));
        for (e eVar : filesData) {
            String fileName = eVar.getFileName();
            boolean rebootRequired = eVar.getRebootRequired();
            String key = eVar.getKey();
            tl0.a aVar = this.f159926a;
            byte[] bArrA = aVar.a(key);
            byte[] bArrA2 = aVar.a(eVar.getSignature());
            List binaryBlocks = eVar.getBinaryBlocks();
            ArrayList arrayList2 = new ArrayList(w.t(binaryBlocks, 10));
            Iterator it8 = binaryBlocks.iterator();
            while (it8.hasNext()) {
                arrayList2.add(aVar.a((String) it8.next()));
            }
            arrayList.add(new h(fileName, rebootRequired, bArrA, bArrA2, arrayList2));
        }
        return new g(hash, arrayList);
    }
}
