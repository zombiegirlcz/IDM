package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class SurfaceCombination {
    private final List<SurfaceConfig> mSurfaceConfigList = new ArrayList();

    private static void generateArrangements(List<int[]> list, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    iArr[i2] = i3;
                    generateArrangements(list, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
        }
    }

    private List<int[]> getElementsArrangements(int i) {
        ArrayList arrayList = new ArrayList();
        generateArrangements(arrayList, i, new int[i], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    public List<SurfaceConfig> getOrderedSupportedSurfaceConfigList(List<SurfaceConfig> list) {
        int i;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.mSurfaceConfigList.size()) {
            return null;
        }
        List<int[]> elementsArrangements = getElementsArrangements(this.mSurfaceConfigList.size());
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        Iterator<int[]> it8 = elementsArrangements.iterator();
        while (true) {
            i = 0;
            if (!it8.hasNext()) {
                break;
            }
            int[] next = it8.next();
            boolean zIsSupported = true;
            while (i < this.mSurfaceConfigList.size()) {
                if (next[i] < list.size()) {
                    zIsSupported &= this.mSurfaceConfigList.get(i).isSupported(list.get(next[i]));
                    if (!zIsSupported) {
                        break;
                    }
                    surfaceConfigArr[next[i]] = this.mSurfaceConfigList.get(i);
                }
                i++;
            }
            if (zIsSupported) {
                i = 1;
                break;
            }
        }
        if (i != 0) {
            return Arrays.asList(surfaceConfigArr);
        }
        return null;
    }
}
