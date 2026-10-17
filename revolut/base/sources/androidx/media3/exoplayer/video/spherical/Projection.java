package androidx.media3.exoplayer.video.spherical;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes15.dex */
final class Projection {
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public SubMesh getSubMesh(int i) {
            return this.subMeshes[i];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }
    }

    public static final class SubMesh {
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i, float[] fArr, float[] fArr2, int i2) {
            this.textureId = i;
            Preconditions.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i2;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public Projection(Mesh mesh, int i) {
        this(mesh, mesh, i);
    }

    public static Projection createEquirectangular(int i) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f, int i, int i2, float f4, float f5, int i3) {
        int i5;
        int i6 = i;
        Preconditions.checkArgument(f > BitmapDescriptorFactory.HUE_RED);
        Preconditions.checkArgument(i6 >= 1);
        Preconditions.checkArgument(i2 >= 1);
        Preconditions.checkArgument(f4 > BitmapDescriptorFactory.HUE_RED && f4 <= 180.0f);
        Preconditions.checkArgument(f5 > BitmapDescriptorFactory.HUE_RED && f5 <= 360.0f);
        float radians = (float) Math.toRadians(f4);
        float radians2 = (float) Math.toRadians(f5);
        float f6 = radians / i6;
        float f32 = radians2 / i2;
        int i21 = i2 + 1;
        int i22 = ((i21 * 2) + 2) * i6;
        float[] fArr = new float[i22 * 3];
        float[] fArr2 = new float[i22 * 2];
        int i32 = 0;
        int i33 = 0;
        int i43 = 0;
        while (i32 < i6) {
            float f35 = radians / 2.0f;
            float f36 = (i32 * f6) - f35;
            int i59 = i32 + 1;
            float f37 = (i59 * f6) - f35;
            int i66 = 0;
            while (i66 < i21) {
                float f41 = radians;
                float f42 = radians2;
                int i74 = 0;
                int i92 = 2;
                while (i74 < i92) {
                    float f57 = f6;
                    float f69 = i66 * f32;
                    float f75 = f32;
                    float f77 = f36;
                    double d = f;
                    double d5 = (f69 + 3.1415927f) - (f42 / 2.0f);
                    double d6 = i74 == 0 ? f36 : f37;
                    fArr[i33] = -((float) (Math.cos(d6) * Math.sin(d5) * d));
                    fArr[i33 + 1] = (float) (Math.sin(d6) * d);
                    int i96 = i33 + 3;
                    fArr[i33 + 2] = (float) (Math.cos(d6) * Math.cos(d5) * d);
                    fArr2[i43] = f69 / f42;
                    int i99 = i43 + 2;
                    fArr2[i43 + 1] = ((i32 + i74) * f57) / f41;
                    if ((i66 == 0 && i74 == 0) || (i66 == i2 && i74 == 1)) {
                        System.arraycopy(fArr, i33, fArr, i96, 3);
                        i33 += 6;
                        i5 = 2;
                        System.arraycopy(fArr2, i43, fArr2, i99, 2);
                        i43 += 4;
                    } else {
                        i5 = 2;
                        i33 = i96;
                        i43 = i99;
                    }
                    i74++;
                    i92 = i5;
                    f6 = f57;
                    f32 = f75;
                    f36 = f77;
                }
                i66++;
                radians2 = f42;
                radians = f41;
                f6 = f6;
            }
            i6 = i;
            i32 = i59;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr, fArr2, 1)), i3);
    }
}
