package com.revolut.core.backend_flow.ui;

import android.os.Bundle;
import com.revolut.core.backend_flow.ui.BackendFlowSnapshotsCompressor;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qa9.r;
import te0.e;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends e {
    public final r d;
    public final BackendFlowSnapshotsCompressor e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r mapper, BackendFlowSnapshotsCompressor compressor) {
        super("backendFlowSnapshots", r0.g());
        Intrinsics.checkNotNullParameter("backendFlowSnapshots", "key");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(compressor, "compressor");
        this.d = mapper;
        this.e = compressor;
    }

    @Override // te0.e
    public final Object d(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        BackendFlowSnapshotsCompressor.Result compressed = (BackendFlowSnapshotsCompressor.Result) bundle.getParcelable(this.f270012c);
        if (compressed == null) {
            return r0.g();
        }
        this.e.getClass();
        Intrinsics.checkNotNullParameter(compressed, "compressed");
        if (compressed instanceof BackendFlowSnapshotsCompressor.Result.Empty) {
            return r0.g();
        }
        if (!(compressed instanceof BackendFlowSnapshotsCompressor.Result.Compressed)) {
            throw new NoWhenBranchMatchedException();
        }
        BackendFlowSnapshotsCompressor.Result.Compressed compressed2 = (BackendFlowSnapshotsCompressor.Result.Compressed) compressed;
        BackendFlow backendFlowA = compressed2.f51316b;
        ArrayList<BackendFlowSnapshotsCompressor.Result.Compressed.SnapshotDiff> arrayList = compressed2.f51317c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size() + 1);
        linkedHashMap.put(compressed2.f51315a, backendFlowA);
        for (BackendFlowSnapshotsCompressor.Result.Compressed.SnapshotDiff snapshotDiff : arrayList) {
            String str = snapshotDiff.f51318a;
            BackendFlowSnapshotsCompressor.Diff diff = snapshotDiff.f51319b;
            Intrinsics.checkNotNullParameter(backendFlowA, "<this>");
            LinkedList linkedList = new LinkedList();
            for (BackendScreen backendScreen : backendFlowA.e) {
                String f63423a = backendScreen.getF63423a();
                Set set = diff.d;
                LinkedHashMap linkedHashMap2 = diff.e;
                if (!set.contains(f63423a)) {
                    if (linkedHashMap2.containsKey(f63423a)) {
                        BackendScreen backendScreen2 = (BackendScreen) linkedHashMap2.get(backendScreen.getF63423a());
                        if (backendScreen2 != null) {
                            linkedList.add(backendScreen2);
                        }
                    } else {
                        linkedList.add(backendScreen);
                    }
                }
            }
            linkedList.addAll(diff.f51314c);
            String str2 = diff.f51312a;
            if (str2 != null) {
                Iterator it8 = linkedList.iterator();
                int i = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (Intrinsics.f(((BackendScreen) it8.next()).getF63423a(), str2)) {
                        break;
                    }
                    i++;
                }
                Object objRemove = linkedList.remove(i);
                Intrinsics.checkNotNullExpressionValue(objRemove, "removeAt(...)");
                linkedList.add(0, (BackendScreen) objRemove);
            }
            backendFlowA = BackendFlow.a(diff.f51313b, linkedList, null, 495);
            linkedHashMap.put(str, backendFlowA);
        }
        return linkedHashMap;
    }

    @Override // te0.e
    public final void e(Bundle bundle, Object obj2) {
        Object compressed;
        Map value = (Map) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Map snapshots = (Map) this.d.invoke(value);
        this.e.getClass();
        Intrinsics.checkNotNullParameter(snapshots, "snapshots");
        if (snapshots.isEmpty()) {
            compressed = BackendFlowSnapshotsCompressor.Result.Empty.f51320a;
        } else {
            Set setEntrySet = snapshots.entrySet();
            Map.Entry entry = (Map.Entry) d0.a0(setEntrySet);
            String str = (String) entry.getKey();
            BackendFlow backendFlow = (BackendFlow) entry.getValue();
            List<Map.Entry> listV = d0.V(setEntrySet, 1);
            ArrayList arrayList = new ArrayList(w.t(listV, 10));
            BackendFlow backendFlow2 = backendFlow;
            for (Map.Entry entry2 : listV) {
                String str2 = (String) entry2.getKey();
                BackendFlow backendFlow3 = (BackendFlow) entry2.getValue();
                Intrinsics.checkNotNullParameter(backendFlow3, "<this>");
                LinkedHashMap linkedHashMap = new LinkedHashMap(backendFlow2.e.size());
                for (Object obj3 : backendFlow2.e) {
                    linkedHashMap.put(((BackendScreen) obj3).getF63423a(), obj3);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (BackendScreen backendScreen : backendFlow3.e) {
                    BackendScreen backendScreen2 = (BackendScreen) linkedHashMap.get(backendScreen.getF63423a());
                    if (backendScreen2 == null) {
                        linkedHashSet.add(backendScreen);
                    } else if (backendScreen.equals(backendScreen2)) {
                        linkedHashMap.remove(backendScreen2.getF63423a());
                    } else {
                        linkedHashMap2.put(backendScreen.getF63423a(), backendScreen);
                        linkedHashMap.remove(backendScreen2.getF63423a());
                    }
                }
                BackendScreen backendScreen3 = (BackendScreen) d0.d0(backendFlow3.e);
                String f63423a = backendScreen3 != null ? backendScreen3.getF63423a() : null;
                BackendFlow backendFlowA = BackendFlow.a(backendFlow3, f0.f322471a, null, 495);
                Set setKeySet = linkedHashMap.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                arrayList.add(new BackendFlowSnapshotsCompressor.Result.Compressed.SnapshotDiff(str2, new BackendFlowSnapshotsCompressor.Diff(f63423a, backendFlowA, linkedHashSet, d0.i1(setKeySet), linkedHashMap2)));
                backendFlow2 = backendFlow3;
            }
            compressed = new BackendFlowSnapshotsCompressor.Result.Compressed(str, backendFlow, arrayList);
        }
        m70.a.r(bundle, this.f270012c, compressed);
    }
}
