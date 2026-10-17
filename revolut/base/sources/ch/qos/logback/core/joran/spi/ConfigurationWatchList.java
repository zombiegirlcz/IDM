package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ConfigurationWatchList extends ContextAwareBase {
    List<File> fileWatchList = new ArrayList();
    List<Long> lastModifiedList = new ArrayList();
    URL mainURL;

    private void addAsFileToWatch(URL url2) {
        File fileConvertToFile = convertToFile(url2);
        if (fileConvertToFile != null) {
            this.fileWatchList.add(fileConvertToFile);
            this.lastModifiedList.add(Long.valueOf(fileConvertToFile.lastModified()));
        }
    }

    public void addToWatchList(URL url2) {
        addAsFileToWatch(url2);
    }

    public ConfigurationWatchList buildClone() {
        ConfigurationWatchList configurationWatchList = new ConfigurationWatchList();
        configurationWatchList.mainURL = this.mainURL;
        configurationWatchList.fileWatchList = new ArrayList(this.fileWatchList);
        configurationWatchList.lastModifiedList = new ArrayList(this.lastModifiedList);
        return configurationWatchList;
    }

    public boolean changeDetected() {
        int size = this.fileWatchList.size();
        for (int i = 0; i < size; i++) {
            if (this.lastModifiedList.get(i).longValue() != this.fileWatchList.get(i).lastModified()) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        this.mainURL = null;
        this.lastModifiedList.clear();
        this.fileWatchList.clear();
    }

    public File convertToFile(URL url2) {
        if ("file".equals(url2.getProtocol())) {
            return new File(URLDecoder.decode(url2.getFile()));
        }
        addInfo("URL [" + url2 + "] is not of type file");
        return null;
    }

    public List<File> getCopyOfFileWatchList() {
        return new ArrayList(this.fileWatchList);
    }

    public URL getMainURL() {
        return this.mainURL;
    }

    public void setMainURL(URL url2) {
        this.mainURL = url2;
        if (url2 != null) {
            addAsFileToWatch(url2);
        }
    }
}
