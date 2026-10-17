package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\r\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "nodes", "", "args", "", "count", "", "addPathNodes", "(CLjava/util/ArrayList;[FI)V", "", "pathMoveNodeFromArgs", "(Ljava/util/List;[FI)V", "pathRelativeMoveNodeFromArgs", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PathNodeKt {
    public static final void addPathNodes(char c2, @NotNull ArrayList<PathNode> arrayList, @NotNull float[] fArr, int i) {
        int i2 = 0;
        switch (c2) {
            case 'A':
                int i3 = i - 7;
                for (int i5 = 0; i5 <= i3; i5 += 7) {
                    arrayList.add(new PathNode.ArcTo(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], Float.compare(fArr[i5 + 3], BitmapDescriptorFactory.HUE_RED) != 0, Float.compare(fArr[i5 + 4], BitmapDescriptorFactory.HUE_RED) != 0, fArr[i5 + 5], fArr[i5 + 6]));
                }
                return;
            case 'C':
                int i6 = i - 6;
                while (i2 <= i6) {
                    arrayList.add(new PathNode.CurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                return;
            case 'H':
                int i21 = i - 1;
                while (i2 <= i21) {
                    arrayList.add(new PathNode.HorizontalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'L':
                int i22 = i - 2;
                while (i2 <= i22) {
                    arrayList.add(new PathNode.LineTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'M':
                pathMoveNodeFromArgs(arrayList, fArr, i);
                return;
            case 'Q':
                int i32 = i - 4;
                while (i2 <= i32) {
                    arrayList.add(new PathNode.QuadTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 'S':
                int i33 = i - 4;
                while (i2 <= i33) {
                    arrayList.add(new PathNode.ReflectiveCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 'T':
                int i43 = i - 2;
                while (i2 <= i43) {
                    arrayList.add(new PathNode.ReflectiveQuadTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'V':
                int i59 = i - 1;
                while (i2 <= i59) {
                    arrayList.add(new PathNode.VerticalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(PathNode.Close.INSTANCE);
                return;
            case 'a':
                int i66 = i - 7;
                for (int i74 = 0; i74 <= i66; i74 += 7) {
                    arrayList.add(new PathNode.RelativeArcTo(fArr[i74], fArr[i74 + 1], fArr[i74 + 2], Float.compare(fArr[i74 + 3], BitmapDescriptorFactory.HUE_RED) != 0, Float.compare(fArr[i74 + 4], BitmapDescriptorFactory.HUE_RED) != 0, fArr[i74 + 5], fArr[i74 + 6]));
                }
                return;
            case 'c':
                int i92 = i - 6;
                while (i2 <= i92) {
                    arrayList.add(new PathNode.RelativeCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                return;
            case 'h':
                int i96 = i - 1;
                while (i2 <= i96) {
                    arrayList.add(new PathNode.RelativeHorizontalTo(fArr[i2]));
                    i2++;
                }
                return;
            case LDSFile.EF_DG12_TAG /* 108 */:
                int i99 = i - 2;
                while (i2 <= i99) {
                    arrayList.add(new PathNode.RelativeLineTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case LDSFile.EF_DG13_TAG /* 109 */:
                pathRelativeMoveNodeFromArgs(arrayList, fArr, i);
                return;
            case 'q':
                int i100 = i - 4;
                while (i2 <= i100) {
                    arrayList.add(new PathNode.RelativeQuadTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG /* 115 */:
                int i101 = i - 4;
                while (i2 <= i101) {
                    arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 't':
                int i102 = i - 2;
                while (i2 <= i102) {
                    arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case LDSFile.EF_DG4_TAG /* 118 */:
                int i103 = i - 1;
                while (i2 <= i103) {
                    arrayList.add(new PathNode.RelativeVerticalTo(fArr[i2]));
                    i2++;
                }
                return;
            default:
                throw new IllegalArgumentException(a.j(c2, "Unknown command for: "));
        }
    }

    private static final void pathMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new PathNode.LineTo(fArr[i3], fArr[i3 + 1]));
            }
        }
    }

    private static final void pathRelativeMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new PathNode.RelativeLineTo(fArr[i3], fArr[i3 + 1]));
            }
        }
    }
}
