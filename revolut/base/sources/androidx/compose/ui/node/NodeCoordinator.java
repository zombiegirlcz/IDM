package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.FrameRateCategory;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ip0.v7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u0000 Ñ\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004Ò\u0002Ñ\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H&¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001c\u0010\u0014J\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u0014J\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010\u0014J5\u0010)\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010$H\u0014¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b'\u0010,J\r\u0010-\u001a\u00020\u0012¢\u0006\u0004\b-\u0010\u0014J=\u00100\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b.\u0010/J\u001f\u00104\u001a\u00020\u00122\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010*¢\u0006\u0004\b4\u00105J!\u00106\u001a\u00020\u00122\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b6\u00105J\r\u00107\u001a\u00020\u0012¢\u0006\u0004\b7\u0010\u0014J-\u00109\u001a\u00020\u00122\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\b\b\u0002\u00108\u001a\u00020\u000f¢\u0006\u0004\b9\u0010:J5\u0010F\u001a\u00020\u00122\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000f¢\u0006\u0004\bD\u0010EJ7\u0010H\u001a\u00020\u00122\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000fH\u0016¢\u0006\u0004\bG\u0010EJ\r\u0010J\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\u0017\u0010O\u001a\u00020=2\u0006\u0010L\u001a\u00020=H\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010R\u001a\u00020=2\u0006\u0010P\u001a\u00020=H\u0016¢\u0006\u0004\bQ\u0010NJ\u0017\u0010U\u001a\u00020=2\u0006\u0010S\u001a\u00020=H\u0016¢\u0006\u0004\bT\u0010NJ\u0017\u0010W\u001a\u00020=2\u0006\u0010P\u001a\u00020=H\u0016¢\u0006\u0004\bV\u0010NJ\u001f\u0010\\\u001a\u00020=2\u0006\u0010X\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020=H\u0016¢\u0006\u0004\bZ\u0010[J'\u0010\\\u001a\u00020=2\u0006\u0010X\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020=2\u0006\u0010]\u001a\u00020\u000fH\u0016¢\u0006\u0004\b^\u0010_J\u001f\u0010d\u001a\u00020\u00122\u0006\u0010X\u001a\u00020\u00032\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010g\u001a\u00020\u00122\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\be\u0010fJ\u001f\u0010i\u001a\u00020I2\u0006\u0010X\u001a\u00020\u00032\u0006\u0010h\u001a\u00020\u000fH\u0016¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020=2\u0006\u0010P\u001a\u00020=H\u0016¢\u0006\u0004\bk\u0010NJ!\u0010o\u001a\u00020=2\u0006\u0010!\u001a\u00020=2\b\b\u0002\u0010]\u001a\u00020\u000fH\u0016¢\u0006\u0004\bm\u0010nJ!\u0010q\u001a\u00020=2\u0006\u0010!\u001a\u00020=2\b\b\u0002\u0010]\u001a\u00020\u000fH\u0016¢\u0006\u0004\bp\u0010nJ\u001f\u0010t\u001a\u00020\u00122\u0006\u00102\u001a\u0002012\u0006\u0010s\u001a\u00020rH\u0004¢\u0006\u0004\bt\u0010uJ\r\u0010v\u001a\u00020\u0012¢\u0006\u0004\bv\u0010\u0014J\r\u0010w\u001a\u00020\u0012¢\u0006\u0004\bw\u0010\u0014J)\u0010}\u001a\u00020\u00122\u0006\u0010y\u001a\u00020x2\u0006\u0010h\u001a\u00020\u000f2\b\b\u0002\u0010z\u001a\u00020\u000fH\u0000¢\u0006\u0004\b{\u0010|J\u0018\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=H\u0004¢\u0006\u0004\b~\u0010\u007fJ\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=H\u0004¢\u0006\u0005\b\u0081\u0001\u0010\u007fJ\u0011\u0010\u0083\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0083\u0001\u0010\u0014J\u0011\u0010\u0084\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0084\u0001\u0010\u0014J\u001b\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u000f\u0010\u0089\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0089\u0001\u0010\u0011J\u001c\u0010\u008d\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0004¢\u0006\u0005\b\u008c\u0001\u0010NJ$\u0010\u0090\u0001\u001a\u00020\"2\u0006\u0010>\u001a\u00020=2\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0004¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001d\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000b2\u0007\u0010\u0091\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001e\u0010\u0096\u0001\u001a\u00020\u000f2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001JB\u0010\u0099\u0001\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0005\b\u0098\u0001\u0010/J#\u0010\u009a\u0001\u001a\u00020\u00122\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0005\b\u009a\u0001\u00105J\u001d\u0010\u009c\u0001\u001a\u00020\u00122\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J@\u0010 \u0001\u001a\u00020\u0012*\u0004\u0018\u00010\u000b2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000fH\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001JR\u0010¥\u0001\u001a\u00020\u0012*\u0004\u0018\u00010\u000b2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000f2\u0007\u0010¡\u0001\u001a\u00020\"2\u0007\u0010¢\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001JI\u0010¨\u0001\u001a\u00020\u0012*\u0004\u0018\u00010\u000b2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000f2\u0007\u0010¡\u0001\u001a\u00020\"H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001JI\u0010ª\u0001\u001a\u00020\u0012*\u0004\u0018\u00010\u000b2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000f2\u0007\u0010¡\u0001\u001a\u00020\"H\u0002¢\u0006\u0006\b©\u0001\u0010§\u0001J(\u0010\u00ad\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\u000b2\u0006\u0010>\u001a\u00020=2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0016\u0010®\u0001\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J#\u0010³\u0001\u001a\u00020\u00122\u0007\u0010°\u0001\u001a\u00020\u00002\u0006\u0010a\u001a\u00020`H\u0002¢\u0006\u0006\b±\u0001\u0010²\u0001J#\u0010µ\u0001\u001a\u00020\u00122\u0007\u0010°\u0001\u001a\u00020\u00002\u0006\u0010a\u001a\u00020`H\u0002¢\u0006\u0006\b´\u0001\u0010²\u0001J,\u0010¹\u0001\u001a\u00020=2\u0007\u0010°\u0001\u001a\u00020\u00002\u0007\u0010¶\u0001\u001a\u00020=2\u0006\u0010]\u001a\u00020\u000fH\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J,\u0010¹\u0001\u001a\u00020\u00122\u0007\u0010°\u0001\u001a\u00020\u00002\u0007\u0010º\u0001\u001a\u00020x2\u0006\u0010h\u001a\u00020\u000fH\u0002¢\u0006\u0006\b¹\u0001\u0010»\u0001J\"\u0010¼\u0001\u001a\u00020\u00122\u0006\u0010y\u001a\u00020x2\u0006\u0010h\u001a\u00020\u000fH\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0019\u0010¿\u0001\u001a\u00020=2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0005\b¾\u0001\u0010NR\u001d\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0006\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R(\u0010Ã\u0001\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0005\bÅ\u0001\u0010\u0011\"\u0006\bÆ\u0001\u0010\u009d\u0001R(\u0010Ç\u0001\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÇ\u0001\u0010Ä\u0001\u001a\u0005\bÈ\u0001\u0010\u0011\"\u0006\bÉ\u0001\u0010\u009d\u0001R+\u0010Ê\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R+\u0010Ð\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010Ë\u0001\u001a\u0006\bÑ\u0001\u0010Í\u0001\"\u0006\bÒ\u0001\u0010Ï\u0001R\u0019\u0010Ó\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ä\u0001R\u0019\u0010Ô\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Ä\u0001RD\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\u0015\u0010Õ\u0001\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010$8\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\b&\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001R\u001a\u0010Ú\u0001\u001a\u00030Ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u001a\u0010Ý\u0001\u001a\u00030Ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u0019\u0010ß\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u001c\u0010â\u0001\u001a\u0005\u0018\u00010á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R#\u0010æ\u0001\u001a\f\u0012\u0005\u0012\u00030å\u0001\u0018\u00010ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R0\u0010!\u001a\u00020 2\u0007\u0010Õ\u0001\u001a\u00020 8\u0016@TX\u0096\u000e¢\u0006\u0017\n\u0005\b!\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R0\u0010#\u001a\u00020\"2\u0007\u0010Õ\u0001\u001a\u00020\"8\u0006@DX\u0086\u000e¢\u0006\u0017\n\u0005\b#\u0010à\u0001\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R\u001b\u0010ñ\u0001\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u001c\u0010ô\u0001\u001a\u0005\u0018\u00010ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R*\u0010÷\u0001\u001a\u00030ö\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b÷\u0001\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001\"\u0006\bû\u0001\u0010ü\u0001R(\u0010ý\u0001\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bý\u0001\u0010Ä\u0001\u001a\u0005\bþ\u0001\u0010\u0011\"\u0006\bÿ\u0001\u0010\u009d\u0001R(\u0010\u0080\u0002\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0080\u0002\u0010Ä\u0001\u001a\u0005\b\u0081\u0002\u0010\u0011\"\u0006\b\u0082\u0002\u0010\u009d\u0001R\u001b\u0010\u0083\u0002\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u0084\u0002R\u001b\u0010\u0085\u0002\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0086\u0002R0\u0010\u0088\u0002\u001a\u0019\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0087\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0089\u0002R\u001e\u0010\u008b\u0002\u001a\t\u0012\u0004\u0012\u00020\u00120\u008a\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R)\u0010\u008d\u0002\u001a\u00020\u000f2\u0007\u0010Õ\u0001\u001a\u00020\u000f8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u008d\u0002\u0010Ä\u0001\u001a\u0005\b\u008e\u0002\u0010\u0011R.\u0010+\u001a\u0005\u0018\u00010\u008f\u00022\n\u0010Õ\u0001\u001a\u0005\u0018\u00010\u008f\u00028\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b+\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u001b\u0010\u0097\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0084\u0002R\u0017\u0010\u0095\u0002\u001a\u00020\u000b8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R\u0018\u0010\u0098\u0002\u001a\u00030Ü\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0017\u0010\u009a\u0002\u001a\u00020\"8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010î\u0001R\u0017\u0010\u009c\u0002\u001a\u00020\"8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010î\u0001R\u0019\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0017\u0010¢\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b \u0002\u0010¡\u0002R\u0015\u0010¥\u0002\u001a\u00030£\u00028F¢\u0006\b\u001a\u0006\b¤\u0002\u0010ê\u0001R\u0018\u0010©\u0002\u001a\u00030¦\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b§\u0002\u0010¨\u0002R\u0019\u0010«\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bª\u0002\u0010\u009e\u0002R\u0016\u0010\u00ad\u0002\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0002\u0010\u0011R\u0016\u0010®\u0002\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b®\u0002\u0010\u0011R,\u0010³\u0002\u001a\u00030á\u00012\b\u0010Õ\u0001\u001a\u00030á\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b¯\u0002\u0010°\u0002\"\u0006\b±\u0002\u0010²\u0002R0\u0010¹\u0002\u001a\u0005\u0018\u00010´\u00022\n\u0010Õ\u0001\u001a\u0005\u0018\u00010´\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\bµ\u0002\u0010¶\u0002\"\u0006\b·\u0002\u0010¸\u0002R\u001a\u0010½\u0002\u001a\u0005\u0018\u00010º\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b»\u0002\u0010¼\u0002R\u0016\u0010¿\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b¾\u0002\u0010¡\u0002R\u0016\u0010Á\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\bÀ\u0002\u0010¡\u0002R\u0017\u0010Ä\u0002\u001a\u00020x8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÂ\u0002\u0010Ã\u0002R\u0018\u0010Ç\u0002\u001a\u00030Å\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÆ\u0002\u0010ê\u0001R\u0016\u0010È\u0002\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0002\u0010\u0011R\u0015\u0010\u008b\u0001\u001a\u00030\u008a\u00018F¢\u0006\b\u001a\u0006\bÉ\u0002\u0010ê\u0001R\u0018\u0010Í\u0002\u001a\u00030Ê\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010Ì\u0002R,\u0010Ð\u0002\u001a\u0017\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020\u00120\u0087\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÎ\u0002\u0010Ï\u0002¨\u0006Ó\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/node/NodeKind;", "type", "Landroidx/compose/ui/Modifier$Node;", "head-H91voCI", "(I)Landroidx/compose/ui/Modifier$Node;", "head", "", "isTransparent", "()Z", "", "replace$ui", "()V", "replace", "ensureLookaheadDelegateCreated", "", "width", "height", "onMeasureResultChanged", "(II)V", "onCoordinatesUsed$ui", "onCoordinatesUsed", "onMeasured", "onUnplaced", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "releaseLayer", "placeSelfApparentToRealOffset-MLgxB_4", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeSelfApparentToRealOffset", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "draw", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "performDraw", "onPlaced", "forceUpdateLayerParameters", "updateLayerBlock", "(Lkotlin/jvm/functions/Function1;Z)V", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "isInLayer", "hitTest-qzLsGqo", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hitTest", "hitTestChild-qzLsGqo", "hitTestChild", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "relativeToScreen", "screenToLocal-MK-Hz9U", "(J)J", "screenToLocal", "relativeToLocal", "localToScreen-MK-Hz9U", "localToScreen", "relativeToWindow", "windowToLocal-MK-Hz9U", "windowToLocal", "localToWindow-MK-Hz9U", "localToWindow", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "includeMotionFrameOfReference", "localPositionOf-S_NoaFU", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "transformToScreen-58bKbWc", "([F)V", "transformToScreen", "clipBounds", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "localToRoot-MK-Hz9U", "localToRoot", "toParentPosition-8S9VItk", "(JZ)J", "toParentPosition", "fromParentPosition-8S9VItk", "fromParentPosition", "Landroidx/compose/ui/graphics/Paint;", "paint", "drawBorder", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Paint;)V", "onLayoutNodeDetach", "onRelease", "Landroidx/compose/ui/geometry/MutableRect;", "bounds", "clipToMinimumTouchTargetSize", "rectInParent$ui", "(Landroidx/compose/ui/geometry/MutableRect;ZZ)V", "rectInParent", "withinLayerBounds-k-4lQ0M", "(J)Z", "withinLayerBounds", "isPointerInBounds-k-4lQ0M", "isPointerInBounds", "invalidateLayer", "onLayoutModifierNodeChanged", "other", "findCommonAncestor$ui", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "findCommonAncestor", "shouldSharePointerInputWithSiblings", "Landroidx/compose/ui/geometry/Size;", "minimumTouchTargetSize", "calculateMinimumTouchTargetPadding-E7KxVPU", "calculateMinimumTouchTargetPadding", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "distanceInMinimumTouchTarget", "includeTail", "headNode", "(Z)Landroidx/compose/ui/Modifier$Node;", "hasNode-H91voCI", "(I)Z", "hasNode", "explicitLayer", "placeSelf-MLgxB_4", "placeSelf", "drawContainedDrawModifiers", "invokeOnLayoutChange", "updateLayerParameters", "(Z)V", "hit-5ShdDok", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hit", "distanceFromEdge", "isHitInMinimumTouchTargetBetter", "outOfBoundsHit-8NAm7pk", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V", "outOfBoundsHit", "hitNear-Fh5PU_I", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZF)V", "hitNear", "speculativeHit-Fh5PU_I", "speculativeHit", "isInExpandedTouchBounds-ThD-n1k", "(Landroidx/compose/ui/Modifier$Node;JI)Z", "isInExpandedTouchBounds", "toCoordinator", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/node/NodeCoordinator;", "ancestor", "transformToAncestor-EL8BTi8", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "transformToAncestor", "transformFromAncestor-EL8BTi8", "transformFromAncestor", "offset", "ancestorToLocal-S_NoaFU", "(Landroidx/compose/ui/node/NodeCoordinator;JZ)J", "ancestorToLocal", "rect", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;Z)V", "fromParentRect", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "offsetFromEdge-MK-Hz9U", "offsetFromEdge", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "forcePlaceWithLookaheadOffset", "Z", "getForcePlaceWithLookaheadOffset$ui", "setForcePlaceWithLookaheadOffset$ui", "forceMeasureWithLookaheadConstraints", "getForceMeasureWithLookaheadConstraints$ui", "setForceMeasureWithLookaheadConstraints$ui", "wrapped", "Landroidx/compose/ui/node/NodeCoordinator;", "getWrapped$ui", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrappedBy", "getWrappedBy$ui", "setWrappedBy$ui", "released", "isClipping", "value", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/unit/Density;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayerAlpha", "F", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/layout/AlignmentLine;", "oldAlignmentLines", "Landroidx/collection/MutableObjectIntMap;", "J", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "getZIndex", "()F", "setZIndex", "(F)V", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "Landroidx/compose/ui/node/LayerPositionalProperties;", "layerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "Landroidx/compose/ui/graphics/Shape;", "lastShape", "Landroidx/compose/ui/graphics/Shape;", "getLastShape$ui", "()Landroidx/compose/ui/graphics/Shape;", "setLastShape$ui", "(Landroidx/compose/ui/graphics/Shape;)V", "lastClip", "getLastClip$ui", "setLastClip$ui", "wasLayerBlockInvoked", "getWasLayerBlockInvoked$ui", "setWasLayerBlockInvoked$ui", "drawBlockParentLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawBlockCanvas", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/Function2;", "_drawBlock", "Lkotlin/jvm/functions/Function2;", "Lkotlin/Function0;", "invalidateParentLayer", "Lkotlin/jvm/functions/Function0;", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "getFontScale", "fontScale", "getParent", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "parent", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getChild", "child", "getHasMeasureResult", "hasMeasureResult", "isAttached", "getMeasureResult$ui", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "", "getParentData", "()Ljava/lang/Object;", "parentData", "getParentLayoutCoordinates", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "Landroidx/compose/ui/unit/Constraints;", "getLastMeasurementConstraints-msEJaDk$ui", "lastMeasurementConstraints", "isValidOwnerScope", "getMinimumTouchTargetSize-NH-jbRc", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "getDrawBlock", "()Lkotlin/jvm/functions/Function2;", "drawBlock", "Companion", "HitTestSource", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> _drawBlock;
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private Canvas drawBlockCanvas;
    private GraphicsLayer drawBlockParentLayer;
    private GraphicsLayer explicitLayer;
    private boolean forceMeasureWithLookaheadConstraints;
    private boolean forcePlaceWithLookaheadOffset;
    private boolean isClipping;
    private boolean lastClip;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;
    private LayerPositionalProperties layerPositionalProperties;

    @NotNull
    private final LayoutNode layoutNode;
    private MutableObjectIntMap<AlignmentLine> oldAlignmentLines;
    private boolean released;
    private boolean wasLayerBlockInvoked;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayerParams = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.INSTANCE;

    @NotNull
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayer = NodeCoordinator$Companion$onCommitAffectingLayer$1.INSTANCE;

    @NotNull
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();

    @NotNull
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();

    @NotNull
    private static final float[] tmpMatrix = Matrix.m2050constructorimpl$default(null, 1, null);

    @NotNull
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-qzLsGqo, reason: not valid java name */
        public void mo2713childHitTestqzLsGqo(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.m2630hitTest6fMxITs$ui(pointerPosition, hitTestResult, pointerType, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo2714entityTypeOLwlOKw() {
            return NodeKind.m2722constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v7 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            int iM2722constructorimpl = NodeKind.m2722constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != 0) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if ((node.getKindSet() & iM2722constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate = ((DelegatingNode) node).getDelegate();
                    int i = 0;
                    node = node;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & iM2722constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector.add(node);
                                    node = 0;
                                }
                                mutableVector.add(delegate);
                            }
                        }
                        delegate = delegate.getChild();
                        node = node;
                    }
                    if (i == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector);
            }
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            return true;
        }
    };

    @NotNull
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-qzLsGqo */
        public void mo2713childHitTestqzLsGqo(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.m2631hitTestSemantics6fMxITs$ui(pointerPosition, hitTestResult, pointerType, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw */
        public int mo2714entityTypeOLwlOKw() {
            return NodeKind.m2722constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            SemanticsConfiguration semanticsConfiguration = parentLayoutNode.getSemanticsConfiguration();
            boolean z = false;
            if (semanticsConfiguration != null && semanticsConfiguration.getIsClearingSemantics()) {
                z = true;
            }
            return !z;
        }
    };

    @NotNull
    private Density layerDensity = getLayoutNode().getDensity();

    @NotNull
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.INSTANCE.m3343getZeronOccac();

    @NotNull
    private Shape lastShape = RectangleShapeKt.getRectangleShape();

    @NotNull
    private final Function0<Unit> invalidateParentLayer = new NodeCoordinator$invalidateParentLayer$1(this);

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "<init>", "()V", "ExpectAttachedLayoutCoordinates", "", "UnmeasuredError", "onCommitAffectingLayerParams", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayer", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "getSemanticsSource", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        @NotNull
        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&J7\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "entityType", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "interceptOutOfBoundsChildEvents", "", "node", "Landroidx/compose/ui/Modifier$Node;", "shouldHitTestChildren", "parentLayoutNode", "Landroidx/compose/ui/node/LayoutNode;", "childHitTest", "", "layoutNode", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "isInLayer", "childHitTest-qzLsGqo", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface HitTestSource {
        /* JADX INFO: renamed from: childHitTest-qzLsGqo */
        void mo2713childHitTestqzLsGqo(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult hitTestResult, int pointerType, boolean isInLayer);

        /* JADX INFO: renamed from: entityType-OLwlOKw */
        int mo2714entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(@NotNull Modifier.Node node);

        boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        final /* synthetic */ Function1<GraphicsLayerScope, Unit> $layerBlock;
        final /* synthetic */ NodeCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super GraphicsLayerScope, Unit> function1, NodeCoordinator nodeCoordinator) {
            super(0);
            this.$layerBlock = function1;
            this.this$0 = nodeCoordinator;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2719invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2719invoke() {
            this.$layerBlock.invoke(NodeCoordinator.graphicsLayerScope);
            boolean z = this.this$0.getLastShape() != NodeCoordinator.graphicsLayerScope.getShape();
            boolean z3 = this.this$0.getLastClip() != NodeCoordinator.graphicsLayerScope.getClip();
            if (z || z3) {
                this.this$0.setLastShape$ui(NodeCoordinator.graphicsLayerScope.getShape());
                this.this$0.setLastClip$ui(NodeCoordinator.graphicsLayerScope.getClip());
                if (this.this$0.getWasLayerBlockInvoked() && (z3 || (this.this$0.getLastClip() && z))) {
                    this.this$0.getLayoutNode().invalidateSemantics$ui();
                }
            }
            this.this$0.setWasLayerBlockInvoked$ui(true);
            NodeCoordinator.graphicsLayerScope.updateOutline$ui();
        }
    }

    public NodeCoordinator(@NotNull LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    private final void ancestorToLocal(NodeCoordinator ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.ancestorToLocal(ancestor, rect, clipBounds);
        }
        fromParentRect(rect, clipBounds);
    }

    /* JADX INFO: renamed from: ancestorToLocal-S_NoaFU, reason: not valid java name */
    private final long m2688ancestorToLocalS_NoaFU(NodeCoordinator ancestor, long offset, boolean includeMotionFrameOfReference) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        return (nodeCoordinator == null || Intrinsics.f(ancestor, nodeCoordinator)) ? m2703fromParentPosition8S9VItk(offset, includeMotionFrameOfReference) : m2703fromParentPosition8S9VItk(nodeCoordinator.m2688ancestorToLocalS_NoaFU(ancestor, offset, includeMotionFrameOfReference), includeMotionFrameOfReference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node nodeM2706headH91voCI = m2706headH91voCI(NodeKind.m2722constructorimpl(4));
        if (nodeM2706headH91voCI == null) {
            performDraw(canvas, graphicsLayer);
        } else {
            getLayoutNode().getMDrawScope$ui().m2645draweZhPAX0$ui(canvas, IntSizeKt.m3363toSizeozmzZPI(mo2533getSizeYbymL2g()), this, nodeM2706headH91voCI, graphicsLayer);
        }
    }

    /* JADX INFO: renamed from: fromParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m2689fromParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j2, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nodeCoordinator.m2703fromParentPosition8S9VItk(j2, z);
    }

    private final void fromParentRect(MutableRect bounds, boolean clipBounds) {
        float fM3334getXimpl = IntOffset.m3334getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() - fM3334getXimpl);
        bounds.setRight(bounds.getRight() - fM3334getXimpl);
        float fM3335getYimpl = IntOffset.m3335getYimpl(getPosition());
        bounds.setTop(bounds.getTop() - fM3335getYimpl);
        bounds.setBottom(bounds.getBottom() - fM3335getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.intersect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (mo2533getSizeYbymL2g() >> 32), (int) (mo2533getSizeYbymL2g() & BodyPartID.bodyIdMax));
                bounds.isEmpty();
            }
        }
    }

    private final Function2<Canvas, GraphicsLayer, Unit> getDrawBlock() {
        Function2 function2 = this._drawBlock;
        if (function2 != null) {
            return function2;
        }
        NodeCoordinator$drawBlock$1 nodeCoordinator$drawBlock$1 = new NodeCoordinator$drawBlock$1(this, new NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(this));
        this._drawBlock = nodeCoordinator$drawBlock$1;
        return nodeCoordinator$drawBlock$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m2690hasNodeH91voCI(int type) {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m2723getIncludeSelfInTraversalH91voCI(type));
        return nodeHeadNode != null && DelegatableNodeKt.m2611has64DMado(nodeHeadNode, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean includeTail) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (!includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                return nodeCoordinator.getTail();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || (tail = nodeCoordinator2.getTail()) == null) {
            return null;
        }
        return tail.getChild();
    }

    /* JADX INFO: renamed from: hit-5ShdDok, reason: not valid java name */
    private final void m2691hit5ShdDok(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i, boolean z) {
        if (node == null) {
            mo2620hitTestChildqzLsGqo(hitTestSource, j2, hitTestResult, i, z);
            return;
        }
        int i2 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.add(node);
        hitTestResult.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(-1.0f, z, false));
        m2691hit5ShdDok(NodeCoordinatorKt.m2721nextUntilhw7D004(node, hitTestSource.mo2714entityTypeOLwlOKw(), NodeKind.m2722constructorimpl(2)), hitTestSource, j2, hitTestResult, i, z);
        hitTestResult.hitDepth = i2;
    }

    /* JADX INFO: renamed from: hitNear-Fh5PU_I, reason: not valid java name */
    private final void m2692hitNearFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i, boolean z, float f) {
        if (node == null) {
            mo2620hitTestChildqzLsGqo(hitTestSource, j2, hitTestResult, i, z);
            return;
        }
        int i2 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.add(node);
        hitTestResult.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f, z, false));
        m2695outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m2721nextUntilhw7D004(node, hitTestSource.mo2714entityTypeOLwlOKw(), NodeKind.m2722constructorimpl(2)), hitTestSource, j2, hitTestResult, i, z, f, true);
        hitTestResult.hitDepth = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX INFO: renamed from: isInExpandedTouchBounds-ThD-n1k, reason: not valid java name */
    private final boolean m2693isInExpandedTouchBoundsThDn1k(Modifier.Node node, long j2, int i) {
        if (node == 0) {
            return false;
        }
        PointerType.Companion companion = PointerType.INSTANCE;
        if (!PointerType.m2493equalsimpl0(i, companion.m2499getStylusT8wyACA()) && !PointerType.m2493equalsimpl0(i, companion.m2497getEraserT8wyACA())) {
            return false;
        }
        int iM2722constructorimpl = NodeKind.m2722constructorimpl(16);
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof PointerInputModifierNode) {
                long jMo1074getTouchBoundsExpansionRZrCHBk = ((PointerInputModifierNode) node).mo1074getTouchBoundsExpansionRZrCHBk();
                int i2 = (int) (j2 >> 32);
                if (Float.intBitsToFloat(i2) >= (-TouchBoundsExpansion.m2739computeLeftimpl$ui(jMo1074getTouchBoundsExpansionRZrCHBk, getLayoutDirection()))) {
                    if (Float.intBitsToFloat(i2) < TouchBoundsExpansion.m2740computeRightimpl$ui(jMo1074getTouchBoundsExpansionRZrCHBk, getLayoutDirection()) + getMeasuredWidth()) {
                        int i3 = (int) (j2 & BodyPartID.bodyIdMax);
                        if (Float.intBitsToFloat(i3) >= (-TouchBoundsExpansion.m2745getTopimpl(jMo1074getTouchBoundsExpansionRZrCHBk))) {
                            if (Float.intBitsToFloat(i3) < TouchBoundsExpansion.m2742getBottomimpl(jMo1074getTouchBoundsExpansionRZrCHBk) + getMeasuredHeight()) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            if ((node.getKindSet() & iM2722constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate();
                int i5 = 0;
                node = node;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet() & iM2722constructorimpl) != 0) {
                        i5++;
                        if (i5 == 1) {
                            node = delegate$ui;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                mutableVector.add(node);
                                node = 0;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                    delegate$ui = delegate$ui.getChild();
                    node = node;
                }
                if (i5 == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        return false;
    }

    /* JADX INFO: renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m2694offsetFromEdgeMKHz9U(long pointerPosition) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat < BitmapDescriptorFactory.HUE_RED ? -fIntBitsToFloat : fIntBitsToFloat - getMeasuredWidth());
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerPosition & BodyPartID.bodyIdMax));
        return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat2 < BitmapDescriptorFactory.HUE_RED ? -fIntBitsToFloat2 : fIntBitsToFloat2 - getMeasuredHeight()))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fMax)) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: outOfBoundsHit-8NAm7pk, reason: not valid java name */
    public final void m2695outOfBoundsHit8NAm7pk(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i, boolean z, float f, boolean z3) {
        if (node == null) {
            mo2620hitTestChildqzLsGqo(hitTestSource, j2, hitTestResult, i, z);
            return;
        }
        if (m2693isInExpandedTouchBoundsThDn1k(node, j2, i)) {
            hitTestResult.hitExpandedTouchBounds(node, z, new NodeCoordinator$outOfBoundsHit$1(this, node, hitTestSource, j2, hitTestResult, i, z, f, z3));
        } else if (z3) {
            m2692hitNearFh5PU_I(node, hitTestSource, j2, hitTestResult, i, z, f);
        } else {
            m2697speculativeHitFh5PU_I(node, hitTestSource, j2, hitTestResult, i, z, f);
        }
    }

    /* JADX INFO: renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m2696placeSelfMLgxB_4(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock, GraphicsLayer explicitLayer) {
        if (explicitLayer != null) {
            if (!(layerBlock == null)) {
                InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != explicitLayer) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
                this.explicitLayer = explicitLayer;
            }
            if (this.layer == null) {
                OwnedLayer ownedLayerCreateLayer = LayoutNodeKt.requireOwner(getLayoutNode()).createLayer(getDrawBlock(), this.invalidateParentLayer, explicitLayer);
                ownedLayerCreateLayer.mo2729resizeozmzZPI(getMeasuredSize());
                ownedLayerCreateLayer.mo2728movegyyYBs(position);
                this.layer = ownedLayerCreateLayer;
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
            }
            updateLayerBlock$default(this, layerBlock, false, 2, null);
        }
        if (!IntOffset.m3333equalsimpl0(getPosition(), position)) {
            LayoutNodeKt.requireOwner(getLayoutNode()).voteFrameRate(FrameRateCategory.INSTANCE.m1723getHighNSsRyOo());
            m2710setPositiongyyYBs(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo2728movegyyYBs(position);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            getLayoutNode().onCoordinatorPositionChanged$ui();
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
        if (this == getLayoutNode().getOuterCoordinator$ui()) {
            RectManager.onLayoutPositionChanged$default(LayoutNodeKt.requireOwner(getLayoutNode()).getRectManager(), getLayoutNode(), false, 2, null);
        }
        if (getIsPlacingForAlignment()) {
            return;
        }
        captureRulersIfNeeded$ui(getMeasureResult$ui());
    }

    public static /* synthetic */ void rectInParent$ui$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z3, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        nodeCoordinator.rectInParent$ui(mutableRect, z, z3);
    }

    /* JADX INFO: renamed from: speculativeHit-Fh5PU_I, reason: not valid java name */
    private final void m2697speculativeHitFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i, boolean z, float f) {
        if (node == null) {
            mo2620hitTestChildqzLsGqo(hitTestSource, j2, hitTestResult, i, z);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f, z, new NodeCoordinator$speculativeHit$1(this, node, hitTestSource, j2, hitTestResult, i, z, f));
        } else {
            m2695outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m2721nextUntilhw7D004(node, hitTestSource.mo2714entityTypeOLwlOKw(), NodeKind.m2722constructorimpl(2)), hitTestSource, j2, hitTestResult, i, z, f, false);
        }
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (coordinator = lookaheadLayoutCoordinates.getCoordinator()) != null) {
            return coordinator;
        }
        Intrinsics.i(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    /* JADX INFO: renamed from: toParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m2698toParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j2, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nodeCoordinator.m2711toParentPosition8S9VItk(j2, z);
    }

    /* JADX INFO: renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m2699transformFromAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        if (Intrinsics.f(ancestor, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        Intrinsics.h(nodeCoordinator);
        nodeCoordinator.m2699transformFromAncestorEL8BTi8(ancestor, matrix);
        if (!IntOffset.m3333equalsimpl0(getPosition(), IntOffset.INSTANCE.m3343getZeronOccac())) {
            float[] fArr = tmpMatrix;
            Matrix.m2058resetimpl(fArr);
            Matrix.m2067translateimpl$default(fArr, -IntOffset.m3334getXimpl(getPosition()), -IntOffset.m3335getYimpl(getPosition()), BitmapDescriptorFactory.HUE_RED, 4, null);
            Matrix.m2064timesAssign58bKbWc(matrix, fArr);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo2725inverseTransform58bKbWc(matrix);
        }
    }

    /* JADX INFO: renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m2700transformToAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        NodeCoordinator nodeCoordinator = this;
        while (!nodeCoordinator.equals(ancestor)) {
            OwnedLayer ownedLayer = nodeCoordinator.layer;
            if (ownedLayer != null) {
                ownedLayer.mo2730transform58bKbWc(matrix);
            }
            if (!IntOffset.m3333equalsimpl0(nodeCoordinator.getPosition(), IntOffset.INSTANCE.m3343getZeronOccac())) {
                float[] fArr = tmpMatrix;
                Matrix.m2058resetimpl(fArr);
                Matrix.m2067translateimpl$default(fArr, IntOffset.m3334getXimpl(r1), IntOffset.m3335getYimpl(r1), BitmapDescriptorFactory.HUE_RED, 4, null);
                Matrix.m2064timesAssign58bKbWc(matrix, fArr);
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.h(nodeCoordinator);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        nodeCoordinator.updateLayerBlock(function1, z);
    }

    private final void updateLayerParameters(boolean invokeOnLayoutChange) {
        Owner owner;
        if (this.explicitLayer != null) {
            return;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            if (this.layerBlock == null) {
                return;
            }
            InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
            return;
        }
        Function1<? super GraphicsLayerScope, Unit> function1 = this.layerBlock;
        if (function1 == null) {
            throw v7.v("updateLayerParameters requires a non-null layerBlock");
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
        reusableGraphicsLayerScope.reset();
        reusableGraphicsLayerScope.setGraphicsDensity$ui(getLayoutNode().getDensity());
        reusableGraphicsLayerScope.setLayoutDirection$ui(getLayoutNode().getLayoutDirection());
        reusableGraphicsLayerScope.m2095setSizeuvyYCjk(IntSizeKt.m3363toSizeozmzZPI(mo2533getSizeYbymL2g()));
        getSnapshotObserver().observer.observeReads(this, onCommitAffectingLayerParams, new AnonymousClass1(function1, this));
        LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
        if (layerPositionalProperties == null) {
            layerPositionalProperties = new LayerPositionalProperties();
            this.layerPositionalProperties = layerPositionalProperties;
        }
        LayerPositionalProperties layerPositionalProperties2 = tmpLayerPositionalProperties;
        layerPositionalProperties2.copyFrom(layerPositionalProperties);
        layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
        ownedLayer.updateLayerProperties(reusableGraphicsLayerScope);
        boolean z = this.isClipping;
        this.isClipping = reusableGraphicsLayerScope.getClip();
        this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
        boolean zHasSameValuesAs = layerPositionalProperties2.hasSameValuesAs(layerPositionalProperties);
        if (invokeOnLayoutChange && ((!zHasSameValuesAs || z != this.isClipping) && (owner = getLayoutNode().getOwner()) != null)) {
            owner.onLayoutChange(getLayoutNode());
        }
        if (zHasSameValuesAs) {
            return;
        }
        LayoutNode layoutNode = getLayoutNode();
        LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
        if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                LayoutNode.requestRelayout$ui$default(layoutNode, false, 1, null);
            }
            layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
        }
        layoutNode.onCoordinatorPositionChanged$ui();
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(layoutNode);
        RectManager rectManager = ownerRequireOwner.getRectManager();
        if (this == layoutNode.getOuterCoordinator$ui()) {
            RectManager.onLayoutPositionChanged$default(rectManager, layoutNode, false, 2, null);
        } else {
            rectManager.onLayoutLayerPositionalPropertiesChanged(layoutNode);
        }
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            ownerRequireOwner.requestOnPositionedCallback(layoutNode);
        }
    }

    public static /* synthetic */ void updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        nodeCoordinator.updateLayerParameters(z);
    }

    /* JADX INFO: renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    public final long m2701calculateMinimumTouchTargetPaddingE7KxVPU(long minimumTouchTargetSize) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) - getMeasuredWidth();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (minimumTouchTargetSize & BodyPartID.bodyIdMax)) - getMeasuredHeight();
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat / 2.0f);
        return Size.m1862constructorimpl((((long) Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat2 / 2.0f))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fMax) << 32));
    }

    /* JADX INFO: renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    public final float m2702distanceInMinimumTouchTargettz77jQw(long pointerPosition, long minimumTouchTargetSize) {
        if (getMeasuredWidth() >= Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) && getMeasuredHeight() >= Float.intBitsToFloat((int) (minimumTouchTargetSize & BodyPartID.bodyIdMax))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM2701calculateMinimumTouchTargetPaddingE7KxVPU = m2701calculateMinimumTouchTargetPaddingE7KxVPU(minimumTouchTargetSize);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM2701calculateMinimumTouchTargetPaddingE7KxVPU >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM2701calculateMinimumTouchTargetPaddingE7KxVPU & BodyPartID.bodyIdMax));
        long jM2694offsetFromEdgeMKHz9U = m2694offsetFromEdgeMKHz9U(pointerPosition);
        if ((fIntBitsToFloat > BitmapDescriptorFactory.HUE_RED || fIntBitsToFloat2 > BitmapDescriptorFactory.HUE_RED) && Float.intBitsToFloat((int) (jM2694offsetFromEdgeMKHz9U >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jM2694offsetFromEdgeMKHz9U & BodyPartID.bodyIdMax)) <= fIntBitsToFloat2) {
            return Offset.m1834getDistanceSquaredimpl(jM2694offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(@NotNull Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas, graphicsLayer);
            return;
        }
        float fM3334getXimpl = IntOffset.m3334getXimpl(getPosition());
        float fM3335getYimpl = IntOffset.m3335getYimpl(getPosition());
        canvas.translate(fM3334getXimpl, fM3335getYimpl);
        drawContainedDrawModifiers(canvas, graphicsLayer);
        canvas.translate(-fM3334getXimpl, -fM3335getYimpl);
    }

    public final void drawBorder(@NotNull Canvas canvas, @NotNull Paint paint) {
        canvas.drawRect(0.5f, 0.5f, ((int) (getMeasuredSize() >> 32)) - 0.5f, ((int) (getMeasuredSize() & BodyPartID.bodyIdMax)) - 0.5f, paint);
    }

    public abstract void ensureLookaheadDelegateCreated();

    @NotNull
    public final NodeCoordinator findCommonAncestor$ui(@NotNull NodeCoordinator other) {
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = other.getTail();
            Modifier.Node tail2 = getTail();
            int iM2722constructorimpl = NodeKind.m2722constructorimpl(2);
            if (!tail2.getNode().getIsAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node parent$ui = tail2.getNode().getParent(); parent$ui != null; parent$ui = parent$ui.getParent()) {
                if ((parent$ui.getKindSet() & iM2722constructorimpl) != 0 && parent$ui == tail) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.getParent$ui();
            Intrinsics.h(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.getParent$ui();
            Intrinsics.h(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui();
            layoutNode2 = layoutNode2.getParent$ui();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != other.getLayoutNode()) {
                return layoutNode.getInnerCoordinator$ui();
            }
            return other;
        }
        return this;
    }

    /* JADX INFO: renamed from: fromParentPosition-8S9VItk, reason: not valid java name */
    public long m2703fromParentPosition8S9VItk(long position, boolean includeMotionFrameOfReference) {
        if (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) {
            position = IntOffsetKt.m3344minusNvtHpc(position, getPosition());
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo2727mapOffset8S9VItk(position, true) : position;
    }

    @NotNull
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate().getAlignmentLinesOwner$ui();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    /* JADX INFO: renamed from: getForceMeasureWithLookaheadConstraints$ui, reason: from getter */
    public final boolean getForceMeasureWithLookaheadConstraints() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    /* JADX INFO: renamed from: getLastClip$ui, reason: from getter */
    public final boolean getLastClip() {
        return this.lastClip;
    }

    /* JADX INFO: renamed from: getLastLayerDrawingWasSkipped$ui, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* JADX INFO: renamed from: getLastMeasurementConstraints-msEJaDk$ui, reason: not valid java name */
    public final long m2704getLastMeasurementConstraintsmsEJaDk$ui() {
        return getMeasurementConstraints();
    }

    @NotNull
    /* JADX INFO: renamed from: getLastShape$ui, reason: from getter */
    public final Shape getLastShape() {
        return this.lastShape;
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public MeasureResult getMeasureResult$ui() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m2705getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo769toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo2637getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        onCoordinatesUsed$ui();
        return this.wrappedBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        if (!getLayoutNode().getNodes().m2685hasH91voCI$ui(NodeKind.m2722constructorimpl(64))) {
            return null;
        }
        getTail();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (Modifier.Node tail = getLayoutNode().getNodes().getTail(); tail != null; tail = tail.getParent()) {
            if ((NodeKind.m2722constructorimpl(64) & tail.getKindSet()) != 0) {
                int iM2722constructorimpl = NodeKind.m2722constructorimpl(64);
                MutableVector mutableVector = null;
                Modifier.Node nodePop = tail;
                while (nodePop != 0) {
                    if (nodePop instanceof ParentDataModifierNode) {
                        ref$ObjectRef.f186409a = ((ParentDataModifierNode) nodePop).modifyParentData(getLayoutNode().getDensity(), ref$ObjectRef.f186409a);
                    } else if ((nodePop.getKindSet() & iM2722constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate();
                        int i = 0;
                        nodePop = nodePop;
                        while (delegate$ui != null) {
                            if ((delegate$ui.getKindSet() & iM2722constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    nodePop = delegate$ui;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (nodePop != 0) {
                                        mutableVector.add(nodePop);
                                        nodePop = 0;
                                    }
                                    mutableVector.add(delegate$ui);
                                }
                            }
                            delegate$ui = delegate$ui.getChild();
                            nodePop = nodePop;
                        }
                        if (i == 1) {
                        }
                    }
                    nodePop = DelegatableNodeKt.pop(mutableVector);
                }
            }
        }
        return ref$ObjectRef.f186409a;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            StringBuilder sb6 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (LayoutNode layoutNode = getLayoutNode(); layoutNode != null; layoutNode = layoutNode.getParent$ui()) {
                sb6.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
                sb6.append("|");
                sb6.append(layoutNode);
                sb6.append(" isAttached=");
                sb6.append(layoutNode.isAttached());
                sb6.append(" modifier=");
                sb6.append(layoutNode.get_modifier());
                sb6.append(" tail=");
                sb6.append(getTail());
            }
            InlineClassHelperKt.throwIllegalStateException(sb6.toString());
        }
        onCoordinatesUsed$ui();
        return getLayoutNode().getOuterCoordinator$ui().wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    @NotNull
    public final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long mo2533getSizeYbymL2g() {
        return getMeasuredSize();
    }

    @NotNull
    public abstract Modifier.Node getTail();

    /* JADX INFO: renamed from: getWasLayerBlockInvoked$ui, reason: from getter */
    public final boolean getWasLayerBlockInvoked() {
        return this.wasLayerBlockInvoked;
    }

    /* JADX INFO: renamed from: getWrapped$ui, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    /* JADX INFO: renamed from: getWrappedBy$ui, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    /* JADX INFO: renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m2706headH91voCI(int type) {
        boolean zM2723getIncludeSelfInTraversalH91voCI = NodeKindKt.m2723getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM2723getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return null;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM2723getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & type) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & type) != 0) {
                return nodeHeadNode;
            }
            if (nodeHeadNode == tail) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: hitTest-qzLsGqo, reason: not valid java name */
    public final void m2707hitTestqzLsGqo(@NotNull HitTestSource hitTestSource, long pointerPosition, @NotNull HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        boolean z;
        Modifier.Node nodeM2706headH91voCI = m2706headH91voCI(hitTestSource.mo2714entityTypeOLwlOKw());
        boolean z3 = false;
        if (!m2712withinLayerBoundsk4lQ0M(pointerPosition)) {
            if (PointerType.m2493equalsimpl0(pointerType, PointerType.INSTANCE.m2500getTouchT8wyACA())) {
                float fM2702distanceInMinimumTouchTargettz77jQw = m2702distanceInMinimumTouchTargettz77jQw(pointerPosition, m2705getMinimumTouchTargetSizeNHjbRc());
                if ((Float.floatToRawIntBits(fM2702distanceInMinimumTouchTargettz77jQw) & Integer.MAX_VALUE) >= 2139095040 || !hitTestResult.isHitInMinimumTouchTargetBetter(fM2702distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m2692hitNearFh5PU_I(nodeM2706headH91voCI, hitTestSource, pointerPosition, hitTestResult, pointerType, false, fM2702distanceInMinimumTouchTargettz77jQw);
                return;
            }
            return;
        }
        if (nodeM2706headH91voCI == null) {
            mo2620hitTestChildqzLsGqo(hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        if (m2708isPointerInBoundsk4lQ0M(pointerPosition)) {
            m2691hit5ShdDok(nodeM2706headH91voCI, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        float fM2702distanceInMinimumTouchTargettz77jQw2 = !PointerType.m2493equalsimpl0(pointerType, PointerType.INSTANCE.m2500getTouchT8wyACA()) ? Float.POSITIVE_INFINITY : m2702distanceInMinimumTouchTargettz77jQw(pointerPosition, m2705getMinimumTouchTargetSizeNHjbRc());
        if ((Float.floatToRawIntBits(fM2702distanceInMinimumTouchTargettz77jQw2) & Integer.MAX_VALUE) < 2139095040) {
            z = isInLayer;
            if (hitTestResult.isHitInMinimumTouchTargetBetter(fM2702distanceInMinimumTouchTargettz77jQw2, z)) {
                z3 = true;
            }
        } else {
            z = isInLayer;
        }
        m2695outOfBoundsHit8NAm7pk(nodeM2706headH91voCI, hitTestSource, pointerPosition, hitTestResult, pointerType, z, fM2702distanceInMinimumTouchTargettz77jQw2, z3);
    }

    /* JADX INFO: renamed from: hitTestChild-qzLsGqo */
    public void mo2620hitTestChildqzLsGqo(@NotNull HitTestSource hitTestSource, long pointerPosition, @NotNull HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m2707hitTestqzLsGqo(hitTestSource, m2689fromParentPosition8S9VItk$default(nodeCoordinator, pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().getIsAttached();
    }

    /* JADX INFO: renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m2708isPointerInBoundsk4lQ0M(long pointerPosition) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerPosition & BodyPartID.bodyIdMax));
        return fIntBitsToFloat >= BitmapDescriptorFactory.HUE_RED && fIntBitsToFloat2 >= BitmapDescriptorFactory.HUE_RED && fIntBitsToFloat < ((float) getMeasuredWidth()) && fIntBitsToFloat2 < ((float) getMeasuredHeight());
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sourceCoordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates " + sourceCoordinates + " is not attached!");
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(BitmapDescriptorFactory.HUE_RED);
        rectCache.setTop(BitmapDescriptorFactory.HUE_RED);
        rectCache.setRight((int) (sourceCoordinates.mo2533getSizeYbymL2g() >> 32));
        rectCache.setBottom((int) (sourceCoordinates.mo2533getSizeYbymL2g() & BodyPartID.bodyIdMax));
        NodeCoordinator nodeCoordinator = coordinator;
        while (nodeCoordinator != nodeCoordinatorFindCommonAncestor$ui) {
            boolean z = clipBounds;
            rectInParent$ui$default(nodeCoordinator, rectCache, z, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.h(nodeCoordinator);
            clipBounds = z;
        }
        ancestorToLocal(nodeCoordinatorFindCommonAncestor$ui, rectCache, clipBounds);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo2534localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource) {
        return mo2535localPositionOfS_NoaFU(sourceCoordinates, relativeToSource, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-S_NoaFU */
    public long mo2535localPositionOfS_NoaFU(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (sourceCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadLayoutCoordinates lookaheadLayoutCoordinates = (LookaheadLayoutCoordinates) sourceCoordinates;
            lookaheadLayoutCoordinates.getCoordinator().onCoordinatesUsed$ui();
            return Offset.m1827constructorimpl(lookaheadLayoutCoordinates.mo2535localPositionOfS_NoaFU(this, Offset.m1827constructorimpl(relativeToSource ^ (-9223372034707292160L)), includeMotionFrameOfReference) ^ (-9223372034707292160L));
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui) {
            relativeToSource = coordinator.m2711toParentPosition8S9VItk(relativeToSource, includeMotionFrameOfReference);
            coordinator = coordinator.wrappedBy;
            Intrinsics.h(coordinator);
        }
        return m2688ancestorToLocalS_NoaFU(nodeCoordinatorFindCommonAncestor$ui, relativeToSource, includeMotionFrameOfReference);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo2536localToRootMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        onCoordinatesUsed$ui();
        long jM2698toParentPosition8S9VItk$default = relativeToLocal;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            if (ComposeUiFlags.isRectManagerOffsetUsageFromLayoutCoordinatesEnabled) {
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                if (nodeCoordinator == layoutNode.getOuterCoordinator$ui() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                    long jM2841getOffsetFromRectListForBjo55l4 = LayoutNodeKt.requireOwner(layoutNode).getRectManager().m2841getOffsetFromRectListForBjo55l4(layoutNode);
                    if (!IntOffset.m3333equalsimpl0(jM2841getOffsetFromRectListForBjo55l4, IntOffset.INSTANCE.m3342getMaxnOccac())) {
                        return IntOffsetKt.m3345plusNvtHpc(jM2698toParentPosition8S9VItk$default, jM2841getOffsetFromRectListForBjo55l4);
                    }
                }
            }
            jM2698toParentPosition8S9VItk$default = m2698toParentPosition8S9VItk$default(nodeCoordinator, jM2698toParentPosition8S9VItk$default, false, 2, null);
        }
        return jM2698toParentPosition8S9VItk$default;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo2537localToScreenMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo2502localToScreenMKHz9U(mo2536localToRootMKHz9U(relativeToLocal));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo2538localToWindowMKHz9U(long relativeToLocal) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo2732calculatePositionInWindowMKHz9U(mo2536localToRootMKHz9U(relativeToLocal));
    }

    public final void onCoordinatesUsed$ui() {
        getLayoutNode().getLayoutDelegate().onCoordinatesUsed();
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeDetach() {
        releaseLayer();
        if (getLayoutNode().isPlaced()) {
            onUnplaced();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8 */
    public void onMeasureResultChanged(int width, int height) {
        NodeCoordinator nodeCoordinator;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo2729resizeozmzZPI(IntSize.m3351constructorimpl((((long) width) << 32) | (((long) height) & BodyPartID.bodyIdMax)));
        } else if (getLayoutNode().isPlaced() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.invalidateLayer();
        }
        m2554setMeasuredSizeozmzZPI(IntSize.m3351constructorimpl((((long) height) & BodyPartID.bodyIdMax) | (((long) width) << 32)));
        if (this.layerBlock != null) {
            updateLayerParameters(false);
        }
        int iM2722constructorimpl = NodeKind.m2722constructorimpl(4);
        boolean zM2723getIncludeSelfInTraversalH91voCI = NodeKindKt.m2723getIncludeSelfInTraversalH91voCI(iM2722constructorimpl);
        Modifier.Node tail = getTail();
        if (zM2723getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(zM2723getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM2722constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                if ((nodeHeadNode.getKindSet() & iM2722constructorimpl) != 0) {
                    Modifier.Node nodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof DrawModifierNode) {
                            ((DrawModifierNode) nodePop).onMeasureResultChanged();
                        } else if ((nodePop.getKindSet() & iM2722constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate();
                            int i = 0;
                            nodePop = nodePop;
                            while (delegate$ui != null) {
                                if ((delegate$ui.getKindSet() & iM2722constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        nodePop = delegate$ui;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != 0) {
                                            mutableVector.add(nodePop);
                                            nodePop = 0;
                                        }
                                        mutableVector.add(delegate$ui);
                                    }
                                }
                                delegate$ui = delegate$ui.getChild();
                                nodePop = nodePop;
                            }
                            if (i == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (nodeHeadNode == tail) {
                    break;
                }
            }
        }
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onLayoutChange(getLayoutNode());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final void onMeasured() {
        Modifier.Node parent$ui;
        if (m2690hasNodeH91voCI(NodeKind.m2722constructorimpl(128))) {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int iM2722constructorimpl = NodeKind.m2722constructorimpl(128);
                boolean zM2723getIncludeSelfInTraversalH91voCI = NodeKindKt.m2723getIncludeSelfInTraversalH91voCI(iM2722constructorimpl);
                if (!zM2723getIncludeSelfInTraversalH91voCI) {
                    parent$ui = getTail().getParent();
                    if (parent$ui == null) {
                    }
                    Unit unit = Unit.f186387a;
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                }
                parent$ui = getTail();
                for (Modifier.Node nodeHeadNode = headNode(zM2723getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM2722constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                    if ((nodeHeadNode.getKindSet() & iM2722constructorimpl) != 0) {
                        MutableVector mutableVector = null;
                        Modifier.Node nodePop = nodeHeadNode;
                        while (nodePop != 0) {
                            if (nodePop instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) nodePop).mo691onRemeasuredozmzZPI(getMeasuredSize());
                            } else if ((nodePop.getKindSet() & iM2722constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate();
                                int i = 0;
                                nodePop = nodePop;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet() & iM2722constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != 0) {
                                                mutableVector.add(nodePop);
                                                nodePop = 0;
                                            }
                                            mutableVector.add(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild();
                                    nodePop = nodePop;
                                }
                                if (i == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (nodeHeadNode == parent$ui) {
                        break;
                    }
                }
                Unit unit2 = Unit.f186387a;
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            } catch (Throwable th10) {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                throw th10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void onPlaced() {
        int iM2722constructorimpl = NodeKind.m2722constructorimpl(4194304);
        boolean zM2723getIncludeSelfInTraversalH91voCI = NodeKindKt.m2723getIncludeSelfInTraversalH91voCI(iM2722constructorimpl);
        Modifier.Node tail = getTail();
        if (!zM2723getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM2723getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM2722constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & iM2722constructorimpl) != 0) {
                Modifier.Node nodePop = nodeHeadNode;
                MutableVector mutableVector = null;
                while (nodePop != 0) {
                    if (nodePop instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) nodePop).onPlaced(this);
                    } else if ((nodePop.getKindSet() & iM2722constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate();
                        int i = 0;
                        nodePop = nodePop;
                        while (delegate$ui != null) {
                            if ((delegate$ui.getKindSet() & iM2722constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    nodePop = delegate$ui;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (nodePop != 0) {
                                        mutableVector.add(nodePop);
                                        nodePop = 0;
                                    }
                                    mutableVector.add(delegate$ui);
                                }
                            }
                            delegate$ui = delegate$ui.getChild();
                            nodePop = nodePop;
                        }
                        if (i == 1) {
                        }
                    }
                    nodePop = DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        releaseLayer();
        if (IntOffset.m3333equalsimpl0(getPosition(), IntOffset.INSTANCE.m3343getZeronOccac())) {
            return;
        }
        getLayoutNode().onCoordinatorPositionChanged$ui();
    }

    public final void onUnplaced() {
        if (m2690hasNodeH91voCI(NodeKind.m2722constructorimpl(PKIFailureInfo.badCertTemplate))) {
            int iM2722constructorimpl = NodeKind.m2722constructorimpl(PKIFailureInfo.badCertTemplate);
            boolean zM2723getIncludeSelfInTraversalH91voCI = NodeKindKt.m2723getIncludeSelfInTraversalH91voCI(iM2722constructorimpl);
            Modifier.Node tail = getTail();
            if (!zM2723getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
                return;
            }
            for (Modifier.Node nodeHeadNode = headNode(zM2723getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM2722constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                if ((nodeHeadNode.getKindSet() & iM2722constructorimpl) != 0) {
                    Modifier.Node nodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        if ((nodePop.getKindSet() & iM2722constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate(); delegate$ui != null; delegate$ui = delegate$ui.getChild()) {
                                if ((delegate$ui.getKindSet() & iM2722constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        nodePop = delegate$ui;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != null) {
                                            mutableVector.add(nodePop);
                                            nodePop = null;
                                        }
                                        mutableVector.add(delegate$ui);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (nodeHeadNode == tail) {
                    return;
                }
            }
        }
    }

    public abstract void performDraw(@NotNull Canvas canvas, GraphicsLayer graphicsLayer);

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo2531placeAtf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        if (!this.forcePlaceWithLookaheadOffset) {
            m2696placeSelfMLgxB_4(position, zIndex, layerBlock, null);
            return;
        }
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        Intrinsics.h(lookaheadDelegate);
        m2696placeSelfMLgxB_4(lookaheadDelegate.getPosition(), zIndex, layerBlock, null);
    }

    /* JADX INFO: renamed from: placeSelfApparentToRealOffset-MLgxB_4, reason: not valid java name */
    public final void m2709placeSelfApparentToRealOffsetMLgxB_4(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock, GraphicsLayer layer) {
        m2696placeSelfMLgxB_4(IntOffset.m3338plusqkQi6aY(position, getApparentToRealOffset()), zIndex, layerBlock, layer);
    }

    public final void rectInParent$ui(@NotNull MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jM2705getMinimumTouchTargetSizeNHjbRc = m2705getMinimumTouchTargetSizeNHjbRc();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM2705getMinimumTouchTargetSizeNHjbRc >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM2705getMinimumTouchTargetSizeNHjbRc & BodyPartID.bodyIdMax)) / 2.0f;
                    bounds.intersect(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (mo2533getSizeYbymL2g() >> 32)) + fIntBitsToFloat, ((int) (BodyPartID.bodyIdMax & mo2533getSizeYbymL2g())) + fIntBitsToFloat2);
                } else if (clipBounds) {
                    bounds.intersect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (mo2533getSizeYbymL2g() >> 32), (int) (BodyPartID.bodyIdMax & mo2533getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float fM3334getXimpl = IntOffset.m3334getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() + fM3334getXimpl);
        bounds.setRight(bounds.getRight() + fM3334getXimpl);
        float fM3335getYimpl = IntOffset.m3335getYimpl(getPosition());
        bounds.setTop(bounds.getTop() + fM3335getYimpl);
        bounds.setBottom(bounds.getBottom() + fM3335getYimpl);
    }

    public final void releaseLayer() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            updateLayerBlock$default(this, null, false, 2, null);
            LayoutNode.requestRelayout$ui$default(getLayoutNode(), false, 1, null);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            mo2553placeAtf8xVGno(getPosition(), this.zIndex, graphicsLayer);
        } else {
            mo2531placeAtf8xVGno(getPosition(), this.zIndex, this.layerBlock);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo2539screenToLocalMKHz9U(long relativeToScreen) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo2534localPositionOfR5De75A(LayoutCoordinatesKt.findRootCoordinates(this), LayoutNodeKt.requireOwner(getLayoutNode()).mo2503screenToLocalMKHz9U(relativeToScreen));
    }

    public final void setForcePlaceWithLookaheadOffset$ui(boolean z) {
        this.forcePlaceWithLookaheadOffset = z;
    }

    public final void setLastClip$ui(boolean z) {
        this.lastClip = z;
    }

    public final void setLastShape$ui(@NotNull Shape shape) {
        this.lastShape = shape;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setMeasureResult$ui(@org.jetbrains.annotations.NotNull androidx.compose.ui.layout.MeasureResult r4) {
        /*
            r3 = this;
            androidx.compose.ui.layout.MeasureResult r0 = r3._measureResult
            if (r4 == r0) goto L8c
            r3._measureResult = r4
            if (r0 == 0) goto L1c
            int r1 = r4.get$width()
            int r2 = r0.get$width()
            if (r1 != r2) goto L1c
            int r1 = r4.get$height()
            int r0 = r0.get$height()
            if (r1 == r0) goto L27
        L1c:
            int r0 = r4.get$width()
            int r1 = r4.get$height()
            r3.onMeasureResultChanged(r0, r1)
        L27:
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r0 = r3.oldAlignmentLines
            if (r0 == 0) goto L34
            kotlin.jvm.internal.Intrinsics.h(r0)
            boolean r0 = r0.isNotEmpty()
            if (r0 != 0) goto L3e
        L34:
            java.util.Map r0 = r4.getAlignmentLines()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8c
        L3e:
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r0 = r3.oldAlignmentLines
            java.util.Map r1 = r4.getAlignmentLines()
            boolean r0 = androidx.compose.ui.node.NodeCoordinatorKt.access$compareEquals(r0, r1)
            if (r0 != 0) goto L8c
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r3.getAlignmentLinesOwner()
            androidx.compose.ui.node.AlignmentLines r0 = r0.getAlignmentLines()
            r0.onAlignmentsChanged()
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r0 = r3.oldAlignmentLines
            if (r0 != 0) goto L5f
            androidx.collection.MutableObjectIntMap r0 = androidx.collection.ObjectIntMapKt.mutableObjectIntMapOf()
            r3.oldAlignmentLines = r0
        L5f:
            r0.clear()
            java.util.Map r4 = r4.getAlignmentLines()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L6e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.set(r2, r1)
            goto L6e
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.setMeasureResult$ui(androidx.compose.ui.layout.MeasureResult):void");
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m2710setPositiongyyYBs(long j2) {
        this.position = j2;
    }

    public final void setWasLayerBlockInvoked$ui(boolean z) {
        this.wasLayerBlockInvoked = z;
    }

    public final void setWrapped$ui(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m2723getIncludeSelfInTraversalH91voCI(NodeKind.m2722constructorimpl(16)));
        if (nodeHeadNode != null && nodeHeadNode.getIsAttached()) {
            int iM2722constructorimpl = NodeKind.m2722constructorimpl(16);
            if (!nodeHeadNode.getNode().getIsAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Modifier.Node node = nodeHeadNode.getNode();
            if ((node.getAggregateChildKindSet() & iM2722constructorimpl) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & iM2722constructorimpl) != 0) {
                        Modifier.Node nodePop = node;
                        MutableVector mutableVector = null;
                        while (nodePop != 0) {
                            if (nodePop instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) nodePop).sharePointerInputWithSiblings()) {
                                    return true;
                                }
                            } else if ((nodePop.getKindSet() & iM2722constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate();
                                int i = 0;
                                nodePop = nodePop;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet() & iM2722constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != 0) {
                                                mutableVector.add(nodePop);
                                                nodePop = 0;
                                            }
                                            mutableVector.add(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild();
                                    nodePop = nodePop;
                                }
                                if (i == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    node = node.getChild();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: toParentPosition-8S9VItk, reason: not valid java name */
    public long m2711toParentPosition8S9VItk(long position, boolean includeMotionFrameOfReference) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.mo2727mapOffset8S9VItk(position, false);
        }
        return (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) ? IntOffsetKt.m3345plusNvtHpc(position, getPosition()) : position;
    }

    @NotNull
    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long jM2701calculateMinimumTouchTargetPaddingE7KxVPU = m2701calculateMinimumTouchTargetPaddingE7KxVPU(m2705getMinimumTouchTargetSizeNHjbRc());
        int i = (int) (jM2701calculateMinimumTouchTargetPaddingE7KxVPU >> 32);
        rectCache.setLeft(-Float.intBitsToFloat(i));
        int i2 = (int) (jM2701calculateMinimumTouchTargetPaddingE7KxVPU & BodyPartID.bodyIdMax);
        rectCache.setTop(-Float.intBitsToFloat(i2));
        rectCache.setRight(Float.intBitsToFloat(i) + getMeasuredWidth());
        rectCache.setBottom(Float.intBitsToFloat(i2) + getMeasuredHeight());
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesFindRootCoordinates) {
            nodeCoordinator.rectInParent$ui(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.h(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo2540transformFromEL8BTi8(@NotNull LayoutCoordinates sourceCoordinates, @NotNull float[] matrix) {
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        Matrix.m2058resetimpl(matrix);
        coordinator.m2700transformToAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui, matrix);
        m2699transformFromAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui, matrix);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformToScreen-58bKbWc */
    public void mo2541transformToScreen58bKbWc(@NotNull float[] matrix) {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        NodeCoordinator coordinator = toCoordinator(LayoutCoordinatesKt.findRootCoordinates(this));
        m2700transformToAncestorEL8BTi8(coordinator, matrix);
        if (ownerRequireOwner instanceof MatrixPositionCalculator) {
            ((MatrixPositionCalculator) ownerRequireOwner).mo2422localToScreen58bKbWc(matrix);
            return;
        }
        long jPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(coordinator);
        if ((9223372034707292159L & jPositionOnScreen) != 9205357640488583168L) {
            Matrix.m2066translateimpl(matrix, Float.intBitsToFloat((int) (jPositionOnScreen >> 32)), Float.intBitsToFloat((int) (jPositionOnScreen & BodyPartID.bodyIdMax)), BitmapDescriptorFactory.HUE_RED);
        }
    }

    public final void updateLayerBlock(Function1<? super GraphicsLayerScope, Unit> layerBlock, boolean forceUpdateLayerParameters) {
        Owner owner;
        if (!(layerBlock == null || this.explicitLayer == null)) {
            InlineClassHelperKt.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && Intrinsics.f(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.isAttached() && layerBlock != null) {
            this.layerBlock = layerBlock;
            if (this.layer != null) {
                if (z) {
                    updateLayerParameters$default(this, false, 1, null);
                    return;
                }
                return;
            }
            OwnedLayer ownedLayerCreateLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(layoutNode), getDrawBlock(), this.invalidateParentLayer, null, 4, null);
            ownedLayerCreateLayer$default.mo2729resizeozmzZPI(getMeasuredSize());
            ownedLayerCreateLayer$default.mo2728movegyyYBs(getPosition());
            this.layer = ownedLayerCreateLayer$default;
            updateLayerParameters$default(this, false, 1, null);
            layoutNode.setInnerLayerCoordinatorIsDirty$ui(true);
            this.invalidateParentLayer.invoke();
            return;
        }
        this.layerBlock = null;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (!MatrixKt.m2069isIdentity58bKbWc(ownedLayer.mo2724getUnderlyingMatrixsQKQjiQ())) {
                layoutNode.onCoordinatorPositionChanged$ui();
            }
            ownedLayer.destroy();
            layoutNode.setInnerLayerCoordinatorIsDirty$ui(true);
            this.invalidateParentLayer.invoke();
            if (isAttached() && layoutNode.isPlaced() && (owner = layoutNode.getOwner()) != null) {
                owner.onLayoutChange(layoutNode);
            }
        }
        this.layer = null;
        this.lastLayerDrawingWasSkipped = false;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo2542windowToLocalMKHz9U(long relativeToWindow) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo2534localPositionOfR5De75A(layoutCoordinatesFindRootCoordinates, Offset.m1838minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo2731calculateLocalPositionMKHz9U(relativeToWindow), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRootCoordinates)));
    }

    /* JADX INFO: renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m2712withinLayerBoundsk4lQ0M(long pointerPosition) {
        if ((((9187343241974906880L ^ (pointerPosition & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo2726isInLayerk4lQ0M(pointerPosition);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo2553placeAtf8xVGno(long position, float zIndex, @NotNull GraphicsLayer layer) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.h(lookaheadDelegate);
            m2696placeSelfMLgxB_4(lookaheadDelegate.getPosition(), zIndex, null, layer);
            return;
        }
        m2696placeSelfMLgxB_4(position, zIndex, null, layer);
    }
}
