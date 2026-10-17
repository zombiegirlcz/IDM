package uc;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f278957b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f278958a;

    public h(c cVar) {
        this.f278958a = cVar;
    }

    public static void b(b bVar, e eVar) throws IllegalAccessException, IOException, InvocationTargetException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(bVar.a());
            try {
                String strB = bVar.b();
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = f278957b.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        String str = "NativeLibraryExtractor: split '" + strB + "' has native library '" + strGroup2 + "' for ABI '" + strGroup + "'";
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new g(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str2 : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str2)) {
                        String str3 = "NativeLibraryExtractor: there are native libraries for supported ABI " + str2 + "; will use this ABI";
                        for (g gVar : (Set) map.get(str2)) {
                            String str4 = gVar.f278955a;
                            if (map2.containsKey(str4)) {
                                String str5 = "NativeLibraryExtractor: skipping library " + str4 + " for ABI " + str2 + "; already present for a better ABI";
                            } else {
                                map2.put(str4, gVar);
                                String str6 = "NativeLibraryExtractor: using library " + str4 + " for ABI " + str2;
                            }
                        }
                    } else {
                        String str7 = "NativeLibraryExtractor: there are no native libraries for supported ABI " + str2;
                    }
                }
                eVar.a(zipFile, new HashSet(map2.values()));
                zipFile.close();
            } catch (IOException e) {
                e = e;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                    }
                }
                throw e;
            }
        } catch (IOException e4) {
            e = e4;
            zipFile = null;
        }
    }

    public final HashSet a() throws IllegalAccessException, IOException, InvocationTargetException {
        c cVar = this.f278958a;
        HashSet<b> hashSetA = cVar.a();
        ArrayList<String> arrayList = new ArrayList();
        File file = new File(cVar.g(), "native-libraries");
        c.e(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        for (String str : arrayList) {
            Iterator it8 = hashSetA.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    String str2 = "NativeLibraryExtractor: extracted split '" + str + "' has no corresponding split; deleting";
                    File file3 = new File(cVar.g(), "native-libraries");
                    c.e(file3);
                    File fileD = c.d(file3, str);
                    c.e(fileD);
                    c.c(fileD);
                    break;
                }
                if (((b) it8.next()).b().equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (b bVar : hashSetA) {
            HashSet hashSet2 = new HashSet();
            b(bVar, new k18.c(28, hashSet2, this, bVar));
            String strB = bVar.b();
            HashSet<File> hashSet3 = new HashSet();
            File file4 = new File(cVar.g(), "native-libraries");
            c.e(file4);
            File fileD2 = c.d(file4, strB);
            c.e(fileD2);
            File[] fileArrListFiles2 = fileD2.listFiles();
            if (fileArrListFiles2 != null) {
                for (File file5 : fileArrListFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            for (File file6 : hashSet3) {
                if (!hashSet2.contains(file6)) {
                    String absolutePath = file6.getAbsolutePath();
                    String strB2 = bVar.b();
                    String absolutePath2 = bVar.a().getAbsolutePath();
                    StringBuilder sbM = v0.a.m("NativeLibraryExtractor: file '", absolutePath, "' found in split '", strB2, "' that is not in the split file '");
                    sbM.append(absolutePath2);
                    sbM.append("'; removing");
                    sbM.toString();
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(cVar.g(), "native-libraries");
                    c.e(file7);
                    if (!parentFile.equals(file7)) {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                    c.c(file6);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void c(b bVar, HashSet hashSet, f fVar) {
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            g gVar = (g) it8.next();
            String strB = bVar.b();
            String str = gVar.f278955a;
            c cVar = this.f278958a;
            cVar.getClass();
            File file = new File(cVar.g(), "native-libraries");
            c.e(file);
            File fileD = c.d(file, strB);
            c.e(fileD);
            File fileD2 = c.d(fileD, str);
            boolean z = false;
            if (fileD2.exists() && fileD2.length() == gVar.f278956b.getSize() && !fileD2.canWrite()) {
                z = true;
            }
            fVar.b(gVar, fileD2, z);
        }
    }
}
