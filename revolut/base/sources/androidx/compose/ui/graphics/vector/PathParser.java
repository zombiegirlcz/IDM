package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import zsc.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "<init>", "()V", "", "pathData", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "nodes", "pathStringToNodes", "(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;", "", "nodeData", "[F", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PathParser {

    @NotNull
    private float[] nodeData = new float[64];

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList pathStringToNodes$default(PathParser pathParser, String str, ArrayList arrayList, int i, Object obj2) {
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
        }
        return pathParser.pathStringToNodes(str, arrayList);
    }

    @NotNull
    public final ArrayList<PathNode> pathStringToNodes(@NotNull String pathData, @NotNull ArrayList<PathNode> nodes) {
        int i;
        char cCharAt;
        float fIntBitsToFloat;
        int length = pathData.length();
        int i2 = 0;
        while (i2 < length && Intrinsics.k(pathData.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && Intrinsics.k(pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                i = i2 + 1;
                cCharAt = pathData.charAt(i2);
                int i5 = cCharAt | p.SPACE_CHAR;
                if ((i5 - 122) * (i5 - 97) <= 0 && i5 != 101) {
                    break;
                }
                if (i >= length) {
                    cCharAt = 0;
                    break;
                }
                i2 = i;
            }
            if (cCharAt != 0) {
                int i6 = cCharAt | p.SPACE_CHAR;
                if (i6 != 122) {
                    while (i < length && Intrinsics.k(pathData.charAt(i), 32) <= 0) {
                        i++;
                    }
                    boolean z = i6 == 97;
                    int i21 = 0;
                    do {
                        long jNextFloat = (!z || 3 > i21 || i21 >= 5) ? FastFloatParserKt.nextFloat(pathData, i, length) : FastFloatParserKt.nextFloat(pathData, i, Math.min(i + 1, length));
                        i = (int) (jNextFloat >>> 32);
                        fIntBitsToFloat = Float.intBitsToFloat((int) (jNextFloat & BodyPartID.bodyIdMax));
                        if (!Float.isNaN(fIntBitsToFloat)) {
                            float[] fArr = this.nodeData;
                            int i22 = i21 + 1;
                            fArr[i21] = fIntBitsToFloat;
                            if (i22 >= fArr.length) {
                                float[] destination = new float[i22 * 2];
                                this.nodeData = destination;
                                int length2 = fArr.length;
                                Intrinsics.checkNotNullParameter(fArr, "<this>");
                                Intrinsics.checkNotNullParameter(destination, "destination");
                                System.arraycopy(fArr, 0, destination, 0, length2);
                            }
                            i21 = i22;
                        }
                        while (i < length && (Intrinsics.k(pathData.charAt(i), 32) <= 0 || pathData.charAt(i) == ',')) {
                            i++;
                        }
                        if (i >= length) {
                            break;
                        }
                    } while (!Float.isNaN(fIntBitsToFloat));
                    i3 = i21;
                }
                PathNodeKt.addPathNodes(cCharAt, nodes, this.nodeData, i3);
            }
            i2 = i;
        }
        return nodes;
    }
}
