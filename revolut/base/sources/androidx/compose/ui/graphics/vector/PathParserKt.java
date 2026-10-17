package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a_\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001e\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"", "Landroidx/compose/ui/graphics/vector/PathNode;", "Landroidx/compose/ui/graphics/Path;", "target", "toPath", "(Ljava/util/List;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "", "isMoreThanHalf", "isPositiveArc", "", "drawArc", "(Landroidx/compose/ui/graphics/Path;DDDDDDDZZ)V", "cx", "cy", "e1x", "e1y", "start", "sweep", "arcToBezier", "(Landroidx/compose/ui/graphics/Path;DDDDDDDDD)V", "", "EmptyArray", "[F", "getEmptyArray", "()[F", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PathParserKt {

    @NotNull
    private static final float[] EmptyArray = new float[0];

    private static final void arcToBezier(Path path, double d, double d5, double d6, double d10, double d15, double d41, double d51, double d68, double d81) {
        double d82 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d81 * d82) / 3.141592653589793d));
        double dCos = Math.cos(d51);
        double dSin = Math.sin(d51);
        double dCos2 = Math.cos(d68);
        double dSin2 = Math.sin(d68);
        double d95 = -d6;
        double d100 = d95 * dCos;
        double d101 = d10 * dSin;
        double d102 = (d100 * dSin2) - (d101 * dCos2);
        double d103 = d95 * dSin;
        double d104 = d10 * dCos;
        double d105 = (dCos2 * d104) + (dSin2 * d103);
        double d106 = d81 / ((double) iCeil);
        double d107 = d105;
        double d108 = d102;
        int i = 0;
        double d109 = d15;
        double d110 = d41;
        double d111 = d68;
        while (i < iCeil) {
            double d112 = d111 + d106;
            double dSin3 = Math.sin(d112);
            double dCos3 = Math.cos(d112);
            int i2 = i;
            double d113 = (((d6 * dCos) * dCos3) + d) - (d101 * dSin3);
            double d114 = d82;
            double d115 = (d104 * dSin3) + (d6 * dSin * dCos3) + d5;
            double d116 = (d100 * dSin3) - (d101 * dCos3);
            double d117 = (dCos3 * d104) + (dSin3 * d103);
            double d118 = d112 - d111;
            int i3 = iCeil;
            double dTan = Math.tan(d118 / ((double) 2));
            double dSqrt = ((Math.sqrt(((3.0d * dTan) * dTan) + d114) - ((double) 1)) * Math.sin(d118)) / ((double) 3);
            path.cubicTo((float) ((d108 * dSqrt) + d109), (float) ((d107 * dSqrt) + d110), (float) (d113 - (dSqrt * d116)), (float) (d115 - (dSqrt * d117)), (float) d113, (float) d115);
            dSin = dSin;
            d106 = d106;
            d109 = d113;
            d110 = d115;
            i = i2 + 1;
            d111 = d112;
            d107 = d117;
            iCeil = i3;
            d108 = d116;
            dCos = dCos;
            d82 = d114;
        }
    }

    private static final void drawArc(Path path, double d, double d5, double d6, double d10, double d15, double d41, double d51, boolean z, boolean z3) {
        double d68;
        double d81;
        double d82 = (d51 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d82);
        double dSin = Math.sin(d82);
        double d95 = ((d5 * dSin) + (d * dCos)) / d15;
        double d100 = ((d5 * dCos) + ((-d) * dSin)) / d41;
        double d101 = ((d10 * dSin) + (d6 * dCos)) / d15;
        double d102 = ((d10 * dCos) + ((-d6) * dSin)) / d41;
        double d103 = d95 - d101;
        double d104 = d100 - d102;
        double d105 = 2;
        double d106 = (d95 + d101) / d105;
        double d107 = (d100 + d102) / d105;
        double d108 = (d104 * d104) + (d103 * d103);
        if (d108 == 0.0d) {
            return;
        }
        double d109 = (1.0d / d108) - 0.25d;
        if (d109 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d108) / 1.99999d);
            drawArc(path, d, d5, d6, d10, d15 * dSqrt, d41 * dSqrt, d51, z, z3);
            return;
        }
        double dSqrt2 = Math.sqrt(d109);
        double d110 = d103 * dSqrt2;
        double d111 = dSqrt2 * d104;
        if (z == z3) {
            d68 = d106 - d111;
            d81 = d107 + d110;
        } else {
            d68 = d106 + d111;
            d81 = d107 - d110;
        }
        double dAtan2 = Math.atan2(d100 - d81, d95 - d68);
        double dAtan22 = Math.atan2(d102 - d81, d101 - d68) - dAtan2;
        if (z3 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d112 = d68 * d15;
        double d113 = d81 * d41;
        arcToBezier(path, (d112 * dCos) - (d113 * dSin), (d113 * dCos) + (d112 * dSin), d15, d41, d, d5, d82, dAtan2, dAtan22);
    }

    @NotNull
    public static final Path toPath(@NotNull List<? extends PathNode> list, @NotNull Path path) {
        int i;
        float f;
        int i2;
        PathNode pathNode;
        float f4;
        float f5;
        float x110;
        float y110;
        float x210;
        float y2;
        float dy22;
        float f6;
        float f32;
        float dx12;
        float dy12;
        float dx22;
        float dy23;
        float y34;
        float y5;
        float x3;
        float x5;
        float y9;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int iMo1913getFillTypeRgk1Os = path2.mo1913getFillTypeRgk1Os();
        path2.rewind();
        path2.mo1915setFillTypeoQ8Xj4U(iMo1913getFillTypeRgk1Os);
        PathNode pathNode2 = list2.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list2.size();
        float f35 = BitmapDescriptorFactory.HUE_RED;
        int i3 = 0;
        float arcStartX = 0.0f;
        float arcStartY = 0.0f;
        float x7 = 0.0f;
        float y11 = 0.0f;
        float f36 = 0.0f;
        float f37 = 0.0f;
        while (i3 < size) {
            PathNode pathNode3 = list2.get(i3);
            if (pathNode3 instanceof PathNode.Close) {
                path2.close();
                i = size;
                f = f35;
                i2 = i3;
                pathNode = pathNode3;
                arcStartX = f36;
                x7 = arcStartX;
                arcStartY = f37;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x5 = relativeMoveTo.getDx() + x7;
                    y9 = relativeMoveTo.getDy() + y11;
                    path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                } else if (pathNode3 instanceof PathNode.MoveTo) {
                    PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                    x5 = moveTo.getX();
                    y9 = moveTo.getY();
                    path2.moveTo(moveTo.getX(), moveTo.getY());
                } else {
                    if (pathNode3 instanceof PathNode.RelativeLineTo) {
                        PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                        path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                        x210 = relativeLineTo.getDx() + x7;
                        dy22 = relativeLineTo.getDy();
                    } else {
                        if (pathNode3 instanceof PathNode.LineTo) {
                            PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                            path2.lineTo(lineTo.getX(), lineTo.getY());
                            x210 = lineTo.getX();
                            y2 = lineTo.getY();
                        } else {
                            if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                path2.relativeLineTo(relativeHorizontalTo.getDx(), f35);
                                x3 = relativeHorizontalTo.getDx() + x7;
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                path2.lineTo(horizontalTo.getX(), y11);
                                x3 = horizontalTo.getX();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                    PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                    path2.relativeLineTo(f35, relativeVerticalTo.getDy());
                                    y5 = relativeVerticalTo.getDy() + y11;
                                } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                    PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                    path2.lineTo(x7, verticalTo.getY());
                                    y5 = verticalTo.getY();
                                } else {
                                    if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                        PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                        path2.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                        dx12 = relativeCurveTo.getDx2() + x7;
                                        dy12 = relativeCurveTo.getDy2() + y11;
                                        dx22 = relativeCurveTo.getDx3() + x7;
                                        dy23 = relativeCurveTo.getDy3();
                                    } else if (pathNode3 instanceof PathNode.CurveTo) {
                                        PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                                        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        dx12 = curveTo.getX2();
                                        dy12 = curveTo.getY2();
                                        dx22 = curveTo.getX3();
                                        y34 = curveTo.getY3();
                                        x7 = dx22;
                                        y11 = y34;
                                        i = size;
                                        f = f35;
                                        i2 = i3;
                                        pathNode = pathNode3;
                                        arcStartX = dx12;
                                        arcStartY = dy12;
                                        i3 = i2 + 1;
                                        path2 = path;
                                        pathNode2 = pathNode;
                                        size = i;
                                        f35 = f;
                                        list2 = list;
                                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                                        if (pathNode2.getIsCurve()) {
                                            float f41 = x7 - arcStartX;
                                            f32 = y11 - arcStartY;
                                            f6 = f41;
                                        } else {
                                            f6 = f35;
                                            f32 = f6;
                                        }
                                        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                                        path.relativeCubicTo(f6, f32, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        dx12 = relativeReflectiveCurveTo.getDx1() + x7;
                                        dy12 = relativeReflectiveCurveTo.getDy1() + y11;
                                        dx22 = relativeReflectiveCurveTo.getDx2() + x7;
                                        dy23 = relativeReflectiveCurveTo.getDy2();
                                    } else {
                                        if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                                            if (pathNode2.getIsCurve()) {
                                                float f42 = 2;
                                                x7 = (x7 * f42) - arcStartX;
                                                y11 = (f42 * y11) - arcStartY;
                                            }
                                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                                            path.cubicTo(x7, y11, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            x110 = reflectiveCurveTo.getX1();
                                            y110 = reflectiveCurveTo.getY1();
                                            float x211 = reflectiveCurveTo.getX2();
                                            float y22 = reflectiveCurveTo.getY2();
                                            x7 = x211;
                                            y11 = y22;
                                        } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                                            path.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            arcStartX = relativeQuadTo.getDx1() + x7;
                                            arcStartY = relativeQuadTo.getDy1() + y11;
                                            x210 = relativeQuadTo.getDx2() + x7;
                                            dy22 = relativeQuadTo.getDy2();
                                        } else if (pathNode3 instanceof PathNode.QuadTo) {
                                            PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode3;
                                            path.quadraticTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                            arcStartX = quadTo.getX1();
                                            arcStartY = quadTo.getY1();
                                            x210 = quadTo.getX2();
                                            y2 = quadTo.getY2();
                                        } else if (pathNode3 instanceof PathNode.RelativeReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                f4 = x7 - arcStartX;
                                                f5 = y11 - arcStartY;
                                            } else {
                                                f4 = f35;
                                                f5 = f4;
                                            }
                                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                            path.relativeQuadraticTo(f4, f5, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            x110 = f4 + x7;
                                            y110 = f5 + y11;
                                            float dx9 = relativeReflectiveQuadTo.getDx() + x7;
                                            y11 = relativeReflectiveQuadTo.getDy() + y11;
                                            x7 = dx9;
                                        } else if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                float f57 = 2;
                                                x7 = (x7 * f57) - arcStartX;
                                                y11 = (f57 * y11) - arcStartY;
                                            }
                                            PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                            path.quadraticTo(x7, y11, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                            float f69 = x7;
                                            x7 = reflectiveQuadTo.getX();
                                            arcStartX = f69;
                                            i = size;
                                            f = f35;
                                            i2 = i3;
                                            arcStartY = y11;
                                            pathNode = pathNode3;
                                            y11 = reflectiveQuadTo.getY();
                                            i3 = i2 + 1;
                                            path2 = path;
                                            pathNode2 = pathNode;
                                            size = i;
                                            f35 = f;
                                            list2 = list;
                                        } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                            PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                            float arcStartDx = relativeArcTo.getArcStartDx() + x7;
                                            float arcStartDy = relativeArcTo.getArcStartDy() + y11;
                                            f = f35;
                                            pathNode = pathNode3;
                                            i = size;
                                            i2 = i3;
                                            drawArc(path, x7, y11, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.getIsMoreThanHalf(), relativeArcTo.getIsPositiveArc());
                                            arcStartX = arcStartDx;
                                            x7 = arcStartX;
                                            arcStartY = arcStartDy;
                                        } else {
                                            i = size;
                                            f = f35;
                                            i2 = i3;
                                            pathNode = pathNode3;
                                            if (!(pathNode instanceof PathNode.ArcTo)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                            drawArc(path, x7, y11, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.getIsMoreThanHalf(), arcTo.getIsPositiveArc());
                                            arcStartX = arcTo.getArcStartX();
                                            x7 = arcStartX;
                                            arcStartY = arcTo.getArcStartY();
                                        }
                                        i = size;
                                        f = f35;
                                        i2 = i3;
                                        pathNode = pathNode3;
                                        arcStartY = y110;
                                        arcStartX = x110;
                                        i3 = i2 + 1;
                                        path2 = path;
                                        pathNode2 = pathNode;
                                        size = i;
                                        f35 = f;
                                        list2 = list;
                                    }
                                    y34 = dy23 + y11;
                                    x7 = dx22;
                                    y11 = y34;
                                    i = size;
                                    f = f35;
                                    i2 = i3;
                                    pathNode = pathNode3;
                                    arcStartX = dx12;
                                    arcStartY = dy12;
                                    i3 = i2 + 1;
                                    path2 = path;
                                    pathNode2 = pathNode;
                                    size = i;
                                    f35 = f;
                                    list2 = list;
                                }
                                y11 = y5;
                                i = size;
                                f = f35;
                                i2 = i3;
                                pathNode = pathNode3;
                                i3 = i2 + 1;
                                path2 = path;
                                pathNode2 = pathNode;
                                size = i;
                                f35 = f;
                                list2 = list;
                            }
                            x7 = x3;
                            i = size;
                            f = f35;
                            i2 = i3;
                            pathNode = pathNode3;
                            i3 = i2 + 1;
                            path2 = path;
                            pathNode2 = pathNode;
                            size = i;
                            f35 = f;
                            list2 = list;
                        }
                        y11 = y2;
                        x7 = x210;
                        i = size;
                        f = f35;
                        i2 = i3;
                        pathNode = pathNode3;
                        i3 = i2 + 1;
                        path2 = path;
                        pathNode2 = pathNode;
                        size = i;
                        f35 = f;
                        list2 = list;
                    }
                    y2 = dy22 + y11;
                    y11 = y2;
                    x7 = x210;
                    i = size;
                    f = f35;
                    i2 = i3;
                    pathNode = pathNode3;
                    i3 = i2 + 1;
                    path2 = path;
                    pathNode2 = pathNode;
                    size = i;
                    f35 = f;
                    list2 = list;
                }
                x7 = x5;
                f36 = x7;
                y11 = y9;
                f37 = y11;
                i = size;
                f = f35;
                i2 = i3;
                pathNode = pathNode3;
                i3 = i2 + 1;
                path2 = path;
                pathNode2 = pathNode;
                size = i;
                f35 = f;
                list2 = list;
            }
            y11 = arcStartY;
            i3 = i2 + 1;
            path2 = path;
            pathNode2 = pathNode;
            size = i;
            f35 = f;
            list2 = list;
        }
        return path;
    }
}
